package com.directory;

import java.io.File;
/**
 * Created by Administrator on 2016/10/17.
 * 判断目录是否为空
 */
public class IsDirectory {
    public static void main(String[] args) {
        File file = new File("./src");
        if (file.isDirectory()) {
            String[] files = file.list();
            if (files.length > 0) {
                System.out.println("目录 " + file.getPath() + " 不为空！");
            }
        }
    }
}
