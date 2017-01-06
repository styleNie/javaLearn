package com.directory;

import java.io.File;

/**
 * Created by Administrator on 2016/10/17.
 * 在指定目录中查找文件
 */
public class SearchFile {
    public static void main(String[] argv) throws Exception {
        File dir = new File("../java");
        String[] children = dir.list();
        if (children == null) {
            System.out.println("该目录不存在");
        }
        else {
            for (int i = 0; i < children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }
}
