package com.directory;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by Administrator on 2016/10/17.
 * 在指定目录中查找文件
 */
public class SearchListFile {
    public static void main(String[] args) {
        File dir = new File("C:");
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.startsWith("P");
            }
        };
        String[] children = dir.list(filter);
        if (children == null) {
            System.out.println("目录不存在或它不是一个目录");
        }
        else {
            for (int i=0; i < children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }
}
