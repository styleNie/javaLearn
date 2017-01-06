package com.time;

/**
 * Created by Administrator on 2016/10/16.
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormat {
    public static void main(String[] args){
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));
    }
}
