package com.qzz.day02.day02_03.buffer;

import java.io.*;

/**
 * @ClassName BufferedStreamDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/22 14:40
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//字节缓冲流
public class BufferedStreamDemo {
    public static void main(String[] args) throws Exception {
        //字节缓冲输出流
        //OutputStream out = new FileOutputStream("H:\\789\\BufferedOutputStream.txt");
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("H:\\789\\BufferedOutputStream.txt", true));
        bos.write("hello world".getBytes());
        bos.close();
        //字节缓冲输入流
        BufferedInputStream bin = new BufferedInputStream(new FileInputStream("H:\\789\\BufferedOutputStream.txt"));
        byte[] buffer = new byte[1024];
        int len = -1;
        while ((len = bin.read(buffer)) != -1) {
            System.out.println(new String(buffer,0,len));
        }
        bin.close();
    }
}
