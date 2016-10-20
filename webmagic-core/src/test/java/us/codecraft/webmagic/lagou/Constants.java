package us.codecraft.webmagic.lagou;

import java.net.URL;

/**
 * @author b053-mac
 *         全局变量
 */
public class Constants {

    public static final String Config_DB = "config_key_value.db";


    public static final String LaGou_FILE_PATH = "/Users/apple/data/git/github/thenewsky/webmagic/webmagic-core/log";
    public static final String LaGou_FILE_NAME = "lagou.csv";


    public static  String getDBPath(){
        return LaGou_FILE_PATH + "/" + Constants.LaGou_FILE_NAME;
    }

}