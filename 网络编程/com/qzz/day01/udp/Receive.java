package com.qzz.day01.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @ClassName Receive
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/24 16:10
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class Receive {
    public static void main(String[] args) throws Exception {
        //创建接受端对象
        DatagramSocket receiver = new DatagramSocket(10086);
        byte[] buffer = new byte[1024];
        //接受数据
        DatagramPacket dp = new DatagramPacket(buffer, 1024);
        receiver.receive(dp);
        //获得接收的数据
        String msg = new String(dp.getData(), 0, dp.getLength());
        System.out.println("发送过来的数据：" + msg);
    }
}
