package com.qzz.day01.tcp;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * @ClassName Client
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/24 12:33
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class Client {
    public static void main(String[] args) throws IOException {
        //创建客户端对象，并指明连接服务端的主机和端口
        Socket client = new Socket("localhost", 9999);
        //获得客户端的输入流对象
        Scanner sc = new Scanner(client.getInputStream());
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
        client.close();
    }
}
