package us.codecraft.webmagic.lagou.util;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

/**
 * Created by zhujin on 10/23/16.
 * blog:www.zhujin.me
 * email: zhujin.nova@gmail.com
 */

public class PropertyUtil {



    public static Properties load(String property_path) throws IOException {
        Properties prop = new Properties();
        InputStream in = new BufferedInputStream(new FileInputStream(property_path));
        prop.load(in);     ///加载属性列表
        in.close();
        return prop;
    }


    public static void write(String property_path, HashMap<String, Object> values) throws IOException {
        Properties prop = new Properties();
        FileOutputStream oFile = new FileOutputStream(property_path, true);//true表示追加打开
        if (values != null) {
            for (String key : values.keySet()
                    ) {
                prop.setProperty(key, values.get(key).toString());
            }
        }
        prop.store(oFile, "The New properties file");
        oFile.close();
    }
}