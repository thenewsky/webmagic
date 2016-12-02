package us.codecraft.webmagic.lagou;

import us.codecraft.webmagic.lagou.util.PropertyUtil;

import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

/**
 * @author b053-mac
 *         全局变量
 */
public class Constants {

    public static final String Config_DB = "config_key_value.db";
    private static String base_path = System.getProperty("user.dir") + "/";
    public static final String LaGou_FILE_PATH = base_path + "log";
    public static final String CONFIG_PATH = base_path + "res/";
    public static final String LaGou_FILE_NAME = "lagou.csv";


    public static String getDBPath() {
        return LaGou_FILE_PATH + "/" + Constants.LaGou_FILE_NAME;
    }


    private static String[] analysis_key_words;


    private static Properties properties;
    private static final String defalut_properties = CONFIG_PATH + "setting.properties";

    public static String[] getKeyValues() {
        return analysis_key_words;
    }

    static {
        try {
            properties = PropertyUtil.load(defalut_properties);
        } catch (IOException e) {
            e.printStackTrace();
        }

        analysis_key_words = getValues("key_words");
    }


    public static String getValue(String key) {
        return properties.get(key).toString();
    }

    public static String[] getValues(String key) {
        return getValue(key).split(",");
    }

}