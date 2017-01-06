package com.network;

import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Administrator on 2016/10/17.
 * 查看主机指定文件的最后修改时间
 */
public class FileModifyTime {
    public static void main(String[] argv) throws Exception {
        URL u = new URL("http://127.0.0.1/java.bmp");
        URLConnection uc = u.openConnection();
        uc.setUseCaches(false);
        long timestamp = uc.getLastModified();
        System.out.println("java.bmp 文件最后修改时间 :"+timestamp);
    }
}
