package com.string;

/**
 * Created by Administrator on 2016/10/16.
 */
public class StringReverseExample{
    public static void main(String[] args){
        String string="abcdef";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("\nString before reverse: "+string);
        System.out.println("String after reverse: "+reverse);
    }
}
