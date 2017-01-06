package com.network;

import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by Administrator on 2016/10/17.
 * 使用 Socket 连接到指定主机
 */
public class WebPing {
    public static void main(String[] args) {
        try {
            InetAddress addr;
            Socket sock = new Socket("www.w3cschool.cc", 80);
            addr = sock.getInetAddress();
            System.out.println("连接到 " + addr);
            sock.close();
        } catch (java.io.IOException e) {
            System.out.println("无法连接 " + args[0]);
            System.out.println(e);
        }
    }
}
