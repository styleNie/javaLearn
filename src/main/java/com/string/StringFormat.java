package com.string;

/**
 * Created by Administrator on 2016/10/16.
 */
import java.util.*;

public class StringFormat{
    public static void main(String[] args){
        double e = Math.E;
        System.out.format("%f%n", e);
        System.out.format(Locale.GERMAN, "%-10.4f%n%n", e);  //指定本地为德国（GERMANY）
    }
}
