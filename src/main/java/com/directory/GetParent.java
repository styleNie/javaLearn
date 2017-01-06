package com.directory;

import java.io.File;

/**
 * Created by Administrator on 2016/10/17.
 * 获取文件的上级目录
 */
public class GetParent {
    public static void main(String[] args) {
        File file = new File("C:/File/demo.txt");
        String strParentDirectory = file.getParent();
        System.out.println("文件的上级目录为 : " + strParentDirectory);
    }
}
