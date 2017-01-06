package com.file;

/**
 * Created by Administrator on 2016/10/17.
 * 创建临时文件
 */

import java.io.*;
public class CreateTempFile {
    public static void main(String[] args) throws Exception {
        File temp = File.createTempFile("pattern", ".suffix");
        temp.deleteOnExit();
        BufferedWriter out = new BufferedWriter(new FileWriter(temp));
        out.write("aString");
        System.out.println("临时文件已创建:");
        out.close();
    }
}
