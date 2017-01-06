package com.file;

/**
 * Created by Administrator on 2016/10/17.
 * 在指定目录中创建文件
 */

import java.io.File;
public class FileCreateTempFile {
    public static void main(String[] args) throws Exception {
        File file = null;
        File dir = new File("C:/");
        file = File.createTempFile("JavaTemp", ".javatemp", dir);
        System.out.println(file.getPath());
    }
}
