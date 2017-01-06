package com.directory;

import java.io.*;

/**
 * Created by Administrator on 2016/10/17.
 * 输出指定目录下的所有文件
 */
public class TraverseFile {
    public static void main(String[] args) {
        File dir = new File("C:");
        String[] children = dir.list();
        if (children == null) {
            System.out.println( "目录不存在或它不是一个目录");
        }
        else {
            for (int i=0; i< children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }
}
