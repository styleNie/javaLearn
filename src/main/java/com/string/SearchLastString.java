package com.string;

/**
 * Created by Administrator on 2016/10/16.
 */
public class SearchLastString {
    public static void main(String[] args) {
        String strOrig = "Hello world ,Hello Reader";
        int lastIndex = strOrig.lastIndexOf("Hello");
        if(lastIndex == - 1){
            System.out.println("Hello not found");
        }else{
            System.out.println("Last occurrence of Hello is at index "+ lastIndex);
        }
    }
}