package com.directory;

import java.io.File;
/**
 * Created by Administrator on 2016/10/17.
 * 递归创建目录
 */
public class CreateDirs {
    public static void main(String[] args) {
        String directories = "D:\\a\\b\\c\\d\\e\\f\\g\\h\\i";
        File file = new File(directories);
        boolean result = file.mkdirs();
        System.out.println("Status = " + result);
    }
}
