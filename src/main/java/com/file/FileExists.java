package com.file;

/**
 * Created by Administrator on 2016/10/17.
 * 检测文件是否存在
 */

import java.io.File;
public class FileExists {
    public static void main(String[] args) {
        File file = new File("C:/java.txt");
        System.out.println(file.exists());
    }
}
