package com.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Administrator on 2016/10/17.
 * 获取指定主机的IP地址
 */
public class GetIp {
    public static void main(String[] args) {
        InetAddress address = null;
        try {
            address = InetAddress.getByName("www.baidu.com");
        }
        catch (UnknownHostException e) {
            System.exit(2);
        }
        System.out.println(address.getHostName() + " = " + address.getHostAddress());
        System.exit(0);
    }
}
