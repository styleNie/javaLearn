package com.file;

/**
 * Created by Administrator on 2016/10/17.
 * 获取文件修改时间
 */

import java.io.File;
import java.util.Date;
public class GetLastModified {
    public static void main(String[] args) {
        File file = new File("Main.java");
        Long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date);
    }
}
