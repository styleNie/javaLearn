package com.directory;

import java.io.File;

/**
 * Created by Administrator on 2016/10/17.
 * 查看系统根目录
 */
public class ListRoots {
    public static void main(String[] args){
        File[] roots = File.listRoots();
        System.out.println("系统所有根目录：");
        for (int i=0; i < roots.length; i++) {
            System.out.println(roots[i].toString());
        }
    }
}
