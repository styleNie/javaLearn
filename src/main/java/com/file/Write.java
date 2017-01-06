package com.file;

/**
 * Created by Administrator on 2016/10/17.
 */

import java.io.*;
public class Write {
    public static void main(String[] args){
        try{
            BufferedWriter out = new BufferedWriter(new FileWriter("outfilename"));
            out.write("w3cschool菜鸟教程");
            out.close();
            System.out.println("文件创建成功！");
        }
        catch (IOException e) {
        }
    }
}
