package com.file;

/**
 * Created by Administrator on 2016/10/17.
 * 设置文件只读
 */

import java.io.File;
public class SetReadOnly {
    public static void main(String[] args) {
        File file = new File("C:/java.txt");
        System.out.println(file.setReadOnly());
        System.out.println(file.canWrite());
    }
}
