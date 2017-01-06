package com.directory;

import java.io.File;
import java.util.Date;

/**
 * Created by Administrator on 2016/10/17.
 * 获取目录最后修改时间
 */
public class LastModified {
    public static void main(String[] args) {
        File file = new File("./pom.xml");
        System.out.println("最后修改时间：" + new Date(file.lastModified()));
    }
}
