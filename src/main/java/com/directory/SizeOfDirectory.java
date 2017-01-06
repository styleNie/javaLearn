package com.directory;

import java.io.File;
import org.apache.commons.io.FileUtils;

/**
 * Created by Administrator on 2016/10/17.
 * 获取目录大小
 */
public class SizeOfDirectory {
    public static void main(String[] args) {
        long size = FileUtils.sizeOfDirectory(new File("C:/Users"));
        System.out.println("Size: " + size + " bytes");
    }
}
