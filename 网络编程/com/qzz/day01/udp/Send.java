package com.qzz.day01.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @ClassName Send
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/24 16:11
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class Send {
    public static void main(String[] args) throws Exception {
        String data = "苍茫的天涯是我的爱";

        //创建发送对象
        DatagramSocket sender = new DatagramSocket(10010);
        //发送数据
        DatagramPacket dp = new DatagramPacket(data.getBytes(),//发送的数据
                data.getBytes().length,//发送数据的长度（字节数）
                InetAddress.getLocalHost(),//发送给哪一个IP
                10086);//发送给哪一个端口程序
        sender.send(dp);
        sender.close();
    }
}
