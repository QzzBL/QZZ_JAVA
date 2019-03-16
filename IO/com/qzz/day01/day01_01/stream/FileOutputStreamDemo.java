package com.qzz.day01.day01_01.stream;

import java.io.*;

/**
 * @ClassName FileOutputStreamDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/21 18:25
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//演示文件字节输出流
public class FileOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        //1:创建目标对象（表示把数据保存到哪一个文件）
        File target = new File("H:\\135\\123.txt");
        //2:创建文件字节输出流对象（水管）
        OutputStream out = new FileOutputStream(target, true);//true表示需要追加文件内容
        //3:具体的输出操作（往外写操作）
        /*
          void write(int b): 把一个字节写出到文件中
          void write(byte[] b):把数组b中所有的字节都写出到文件中去
          void write(byte[] b, int off, int len):把数组b中的从off索引开始的len个字节写出到文件中去
         */

        //out.write(65);
        //out.write("ABCDE".getBytes());
        out.write("WillLucyLily".getBytes(), 5, 4);

        //4:关闭资源对象
        out.close();
    }
}
