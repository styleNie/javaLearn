package com.string;

/**
 * Created by Administrator on 2016/10/16.
 */
public class SearchStringEmp{
    public static void main(String[] args) {
        String strOrig = "Hello readers";
        int intIndex = strOrig.indexOf("Hello");
        if(intIndex == - 1){
            System.out.println("Hello not found");
        }else{
            System.out.println("Found Hello at index " + intIndex);
        }
    }
}
