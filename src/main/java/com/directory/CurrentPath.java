package com.directory;

/**
 * Created by Administrator on 2016/10/17.
 * 查看当前工作目录
 */
public class CurrentPath {
    public static void main(String[] args) {
        String curDir = System.getProperty("user.dir");
        System.out.println("你当前的工作目录为: " + curDir);
    }
}
