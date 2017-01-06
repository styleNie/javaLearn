package com.file;

/**
 * Created by Administrator on 2016/10/17.
 * 创建文件
 */

import java.io.File;
import java.io.IOException;
public class CreateFile {
    public static void main(String[] args) {
        try{
            File file = new File("C:/myfile.txt");
            if(file.createNewFile())
                System.out.println("文件创建成功！");
            else
                System.out.println
                        ("出错了，改文件已经存在。");
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
