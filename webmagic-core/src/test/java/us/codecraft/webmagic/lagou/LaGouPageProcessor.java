package us.codecraft.webmagic.lagou;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.lagou.entityes.JsonRootBean;
import us.codecraft.webmagic.lagou.entityes.Result;
import us.codecraft.webmagic.lagou.vo.SearchVo;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;
import us.codecraft.webmagic.selector.Json;
import us.codecraft.webmagic.selector.PlainText;
import us.codecraft.webmagic.selector.Selectable;

import java.io.*;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by zhujin on 10/12/16.
 * blog:www.zhujin.me
 * email: zhujin.nova@gmail.com
 */
public class LaGouPageProcessor implements PageProcessor {

    private static Logger logger = LoggerFactory.getLogger(LaGouPageProcessor.class);
    // 部分一：抓取网站的相关配置，包括编码、抓取间隔、重试次数等
    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);

    private boolean add_all_url = false;

    private static SearchVo select_java_job = new SearchVo("25k-50k", "北京", "java", "1");


    private static LaGouPageProcessor instance = null;
    private static ReentrantLock lock = new ReentrantLock();

    private LaGouPageProcessor() {
    }

    public static Map<String, Result> getResults() {
        return results;
    }

    public static void setResults(Map<String, Result> results) {
        LaGouPageProcessor.results = results;
    }

    private static Map<String, Result> results = new LinkedHashMap<String, Result>();
    private static Set<String> contentSet = new HashSet<String>();

    public static LaGouPageProcessor getInstance() {
        if (instance == null) {
            lock.lock();
            if (instance == null) {
                instance = new LaGouPageProcessor();
            }
            try {
                loadDb();
            } catch (IOException e) {

                try {
                    delDb();
                    loadDb();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            lock.unlock();
        }
        return instance;
    }


    private static void delDb() {
        String path = Constants.getDBPath();
        File file = getFile(path);
        file.deleteOnExit();
    }


    private static void loadDb() throws IOException {
        String path = Constants.getDBPath();
        File file = getFile(path);
        if (!file.exists()) {
            return;
        }
        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (true) {
            String line = bufferedReader.readLine();
            if (line != null) {
                int space_index = line.lastIndexOf(":\t");
                String obj_str = line.substring(space_index + 1, line.length()).trim();
                Result obj = JSON.parseObject(obj_str, Result.class);
                results.put(obj.getPositionid() + "", obj);
                contentSet.addAll(obj.getContentSet());
            } else {
                bufferedReader.close();
                return;
            }
        }

    }

    public static File getFile(String fullName) {
        checkAndMakeParentDirecotry(fullName);
        return new File(fullName);
    }

    public static void checkAndMakeParentDirecotry(String fullName) {
        int index = fullName.lastIndexOf("/");
        if (index > 0) {
            String path = fullName.substring(0, index);
            File file = new File(path);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
    }

    @Override
    // process是定制爬虫逻辑的核心接口，在这里编写抽取逻辑
    public void process(Page page) {


        Html selectable = page.getHtml();


        Selectable xpath = selectable.xpath("//html/body/text()");//json 过滤

        String jsonString = xpath.toString().trim();

        if (!jsonString.isEmpty()) {
            Json json = new Json(jsonString);
//            log(json);
            JsonRootBean jsonRootBean = json.toObject(JsonRootBean.class);
            List<String> urls = new ArrayList<String>();
            for (Result result : jsonRootBean.getContent().getPositionresult().getResult()) {
                results.put("" + result.getPositionid(), result);
                urls.add(result.getHtmlUrl());
            }
            if (!add_all_url) {
                int count = jsonRootBean.getContent().getPositionresult().getTotalcount();
                int pageSize = jsonRootBean.getContent().getPagesize();
                int pageCount = (int) Math.ceil(count * 1d / pageSize);//总页数计算
                for (int i = 0; i < pageCount; i++) {
                    select_java_job.setPn(i + "");
                    page.addTargetRequest(select_java_job.toString());
                }
                add_all_url = true;
            }
            page.addTargetRequests(urls);
        } else {
            String[] subs = page.getUrl().toString().split("/");
            String id = subs[subs.length - 1].replace(".html", "");
            xpath = selectable.xpath("//*[@id=\"job_detail\"]/dd[2]");
            jsonString = xpath.toString().trim();
            if (results.keySet().contains(id)) {
                Result result = results.get(id);
                result.setContent(jsonString);
                page.getResultItems().put(result.getPositionid() + "", result);
            }
        }
    }

    public static void log(Object... objs) {
        StringBuffer sb = new StringBuffer();
        for (Object obj : objs
                ) {
            sb.append(" ");
            sb.append(obj);
        }
        logger.info(sb.toString());
    }


    @Override
    public Site getSite() {
        return site;
    }


    public void runLaGou() {
        Spider.create(getInstance()).addPipeline(new LaGouFilePipeLine())
                .addRequest(new Request(select_java_job.toString()))
                .thread(5).run();
    }

    public static void main(String[] args) {
        LaGouPageProcessor a = LaGouPageProcessor.getInstance();
        for (String string : contentSet) {
            System.out.println(string);
        }

    }


}