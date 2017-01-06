package com.directory;

import java.io.File;

/**
 * Created by Administrator on 2016/10/17.
 * 判断文件是否隐藏
 */
public class IsHidden {
    public static void main(String[] args) {
        File file = new File("C:/Demo.txt");
        System.out.println(file.isHidden());
    }
}
