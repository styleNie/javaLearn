package com.network;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2016/10/17.
 * 获取 URL 响应头信息
 */
public class URLMessage {
    public static void main(String[] args) throws IOException{
        URL url = new URL("http://www.w3cschool.cc");
        URLConnection conn = url.openConnection();

        Map headers = conn.getHeaderFields();
        Set<String> keys = headers.keySet();
        for( String key : keys ){
            String val = conn.getHeaderField(key);
            System.out.println(key+"    "+val);
        }
        System.out.println( conn.getLastModified() );
    }
}