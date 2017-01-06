package com.file;

/**
 * Created by Administrator on 2016/10/17.
 * 向文件中追加数据
 */

import java.io.*;
public class BufferAdd {
    public static void main(String[] args) throws Exception {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("filename"));
            out.write("aString1\n");
            out.close();
            out = new BufferedWriter(new FileWriter("filename",true));
            out.write("aString2");
            out.close();
            BufferedReader in = new BufferedReader(new FileReader("filename"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            in.close();
        }
        catch (IOException e) {
            System.out.println("exception occoured"+ e);
        }
    }
}
