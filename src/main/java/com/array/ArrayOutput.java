package com.array;

/**
 * Created by Administrator on 2016/10/16.
 */
public class ArrayOutput {
    public static void main(String[] args){
        String[] greeting = new String[3];
        greeting[0] = "This is the greeting";
        greeting[1] = "for all the readers from";
        greeting[2] = "Java Source .";
        for (int i = 0; i < greeting.length; i++){
            System.out.println(greeting[i]);
        }
    }
}
