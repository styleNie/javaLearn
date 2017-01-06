package com.file;

/**
 * Created by Administrator on 2016/10/17.
 */

import java.io.*;
public class Read {
    public static void main(String[] args)  {
        try {
            BufferedReader in = new BufferedReader(new FileReader("test.log"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println(str);
        } catch (IOException e) {
        }
    }
}
