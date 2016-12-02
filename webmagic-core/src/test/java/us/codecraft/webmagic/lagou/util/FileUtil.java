package us.codecraft.webmagic.lagou.util;

import java.io.*;

/**
 * Created by zhujin on 10/23/16.
 * blog:www.zhujin.me
 * email: zhujin.nova@gmail.com
 */
public class FileUtil {

    public static String PATH_SEPERATOR = "/";

    static {
        String property = System.getProperties().getProperty("file.separator");
        if (property != null) {
            PATH_SEPERATOR = property;
        }
    }

    public static void printWriter(String path, Object o) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(getFile(path), true), "UTF-8"));
        printWriter.println(o);
        printWriter.close();
    }

    public static File getFile(String fullName) {
        checkAndMakeParentDirecotry(fullName);
        return new File(fullName);
    }


    public static void checkAndMakeParentDirecotry(String fullName) {
        int index = fullName.lastIndexOf(PATH_SEPERATOR);
        if (index > 0) {
            String path = fullName.substring(0, index);
            File file = new File(path);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
    }

}
