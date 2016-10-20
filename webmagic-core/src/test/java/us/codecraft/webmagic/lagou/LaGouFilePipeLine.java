package us.codecraft.webmagic.lagou;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.Consts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.lagou.entityes.Result;
import us.codecraft.webmagic.pipeline.FilePipeline;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Map;

/**
 * Created by zhujin on 10/18/16.
 * blog:www.zhujin.me
 * email: zhujin.nova@gmail.com
 */
public class LaGouFilePipeLine extends FilePipeline {
    {
        setPath(Constants.LaGou_FILE_PATH);
    }

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void process(ResultItems resultItems, Task task) {
        String path = Constants.getDBPath();
        try {

            Map<String, Result> ids = LaGouPageProcessor.getResults();
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(getFile(path), true), "UTF-8"));
            for (Map.Entry<String, Object> entry : resultItems.getAll().entrySet()) {

                if (ids.containsKey(entry.getKey())){
                    logger.warn(entry.getKey()+"----- have in---");
                    continue;
                }

                logger.warn(entry.getKey()+"----- new job");

                if (entry.getValue() instanceof Iterable) {
                    Iterable value = (Iterable) entry.getValue();
                    for (Object o : value) {
                        printWriter.println(o);
                    }
                } else {
                    printWriter.println(entry.getKey() + ":\t" + entry.getValue());
                }
            }
            printWriter.close();
        } catch (IOException e) {
            logger.warn("write file error", e);
        }
    }
}
