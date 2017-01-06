package com.string;

/**
 * Created by Administrator on 2016/10/16.
 */
public class DeleteChar {
    public static void main(String args[]) {
        String str = "this is Java";
        System.out.println(removeCharAt(str, 3));
    }
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
