package com.qzz.day01.tcp;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName Server
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/24 12:32
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class Server {
    public static void main(String[] args) throws IOException {
        String data = "你来啦，吃饭没，吃了再走呗";

        //创建服务端，指定端口为8888
        ServerSocket server = new ServerSocket(9999);
        System.out.println("服务端已经准备就绪......");
        //接受链接服务端的客户端对象
        boolean accept = true;
        while (accept) {
            Socket client = server.accept();
            System.out.println("连接过来的客户端：" + client.getInetAddress());
            //获得该客户端的输出流对象，给该客户端输出数据
            PrintStream out = new PrintStream(client.getOutputStream());
            out.println(data);
        }
        server.close();
    }
}
