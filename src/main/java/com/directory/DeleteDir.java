package com.directory;

import java.io.File;

/**
 * Created by Administrator on 2016/10/17.
 * 删除目录
 */
public class DeleteDir {
    public static void main(String[] argv) throws Exception {
        // 删除当前目录下的 test 目录
        deleteDir(new File("./test"));
    }
    public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        if(dir.delete()) {
            System.out.printf("目录 %s 已被删除\n",dir);
            return true;
        } else {
            System.out.println("目录删除失败！");
            return false;
        }
    }
}
