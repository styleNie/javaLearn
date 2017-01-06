package com.network;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

/**
 * Created by Administrator on 2016/10/17.
 * 获取 URL响应头的日期信息
 */
public class GetURLDate {
    public static void main(String args[]) throws Exception {
        URL url = new URL("http://www.w3cschool.cc");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        long date = httpCon.getDate();
        if (date == 0)
            System.out.println("无法获取信息。");
        else
            System.out.println("Date: " + new Date(date));
    }
}
