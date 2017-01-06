package com.time;

/**
 * Created by Administrator on 2016/10/16.
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeChange {
    public static void main(String[] args){
        Long timeStamp = System.currentTimeMillis();  //获取当前时间戳
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));   // 时间戳转换成时间
        System.out.println(sd);
    }
}
