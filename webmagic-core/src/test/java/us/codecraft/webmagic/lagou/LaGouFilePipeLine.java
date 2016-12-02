package us.codecraft.webmagic.lagou;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.Consts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.lagou.entityes.Result;
import us.codecraft.webmagic.lagou.util.FileUtil;
import us.codecraft.webmagic.pipeline.FilePipeline;

import java.io.*;
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
            StringBuffer stringBuffer = new StringBuffer();
            Map<String, Result> ids = LaGouPageProcessor.getResults();
            for (Map.Entry<String, Object> entry : resultItems.getAll().entrySet()) {

//                if (ids.containsKey(entry.getKey())) {
//                    logger.warn(entry.getKey() + "----- have in---");
//                    continue;
//                }

                logger.warn(entry.getKey() + "----- new job");

                if (entry.getValue() instanceof Iterable) {
                    Iterable value = (Iterable) entry.getValue();
                    for (Object o : value) {
                        stringBuffer.append(o);
                    }
                } else {
                    stringBuffer.append(entry.getKey() + ":\t" + entry.getValue());
                }
            }
            FileUtil.printWriter(path, stringBuffer.toString());
        } catch (IOException e) {
            logger.warn("write file error", e);
        }
    }


}
