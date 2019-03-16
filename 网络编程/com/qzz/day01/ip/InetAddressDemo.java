package com.qzz.day01.ip;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @ClassName InetAddressDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/23 21:19
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//演示IP操作
public class InetAddressDemo {
    public static void main(String[] args) throws IOException {
        //static InetAddress getByName(String host)在给定主机名的情况下确定主机的IP地址
        //QZZ-PC
        InetAddress ip = InetAddress.getByName("QZZ-PC");
        System.out.println(ip);//QZZ-PC/192.168.3.102
        //获取主机名称
        System.out.println(ip.getHostName());
        //获取IP地址
        System.out.println(ip.getHostAddress());
        //static InetAdress getLocaHost() :返回本机IP
        System.out.println(InetAddress.getLocalHost());

        //boolean isReachable(int timeout):是否可达到，是否可以连接访问
        System.out.println(InetAddress.getLocalHost().isReachable(1000));
    }
}
