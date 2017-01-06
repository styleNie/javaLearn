package com.network;

import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Administrator on 2016/10/17.
 * 获取远程文件大小
 */
public class getRemoveFile {
    public static void main(String[] argv) throws Exception {
        int size;
        URL url = new URL("http://www.w3cschool.cc/wp-content/themes/w3cschool.cc/assets/img/newlogo.png");
        URLConnection conn = url.openConnection();
        size = conn.getContentLength();
        if (size < 0)
            System.out.println("无法获取文件大小。");
        else
            System.out.println("文件大小为：" + size + " bytes");
        conn.getInputStream().close();
    }
}
