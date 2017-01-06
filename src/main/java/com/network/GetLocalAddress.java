package com.network;

import java.net.InetAddress;

/**
 * Created by Administrator on 2016/10/17.
 * 获取本机ip地址及主机名
 */
public class GetLocalAddress {
    public static void main(String[] args) throws Exception {
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println("Local HostAddress: "+addr.getHostAddress());
        String hostname = addr.getHostName();
        System.out.println("Local host name: "+hostname);
    }
}
