package com.qzz.day01.day01_01.stream;

import java.io.*;
import java.util.Arrays;

/**
 * @ClassName FileInputStreamDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/21 18:45
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//演示文件字节输入流
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //1.创建源（挖井）
        File f = new File("H:\\135\\123.txt");
        //2.创建文件字节输入流对象，并接在源上
        InputStream in = new FileInputStream(f);
        //3.具体的读取操作
        /*
          注意:如果取到最后没有数据的时候，返回-1
          int read(int b): 读取一个字节，返回读取的字节
          int read(byte[] b): 读取多个字节，并存储到数组b中，从数组b的索引为0的位置开始存储
          int read(byte[] b, int off, int len):读取多个字节，并存储到数组b中,从数组的索引位置off索引位置开始存储
         */


        //=====================================
        /* int data = in.read();
        System.out.println(data);
        System.out.println(in.read());
        System.out.println(in.read()); 可能最后打出的就是-1，因为超过了里面字节数，返回读取了几个字节
        */

        //=====================================
        byte[] buffer = new byte[9];
        /*System.out.println(Arrays.toString(buffer));
        int ret = in.read(buffer);
        System.out.println(Arrays.toString(buffer));// [117, 99, 121, 76, 0, 0, 0, 0, 0]
        System.out.println(ret);// 4
        //把byte[]转换为字符串
        String str = new String(buffer, 0 , buffer.length - 1);
        System.out.println(str);// ucyL  */

        //=====================================
        int ret = in.read(buffer, 1, 4);
        System.out.println(Arrays.toString(buffer));
        System.out.println(ret);

        //把文件中所有的数据都读取的程序中
        int len = -1;//表示当前读取的字节总数，如果为-1，表示读到末尾了

        while ((len = in.read(buffer)) != -1) {
            String str = new String(buffer, 0 , len);
            System.out.println(str);
        }


        //4.关闭资源
        in.close();
    }
}
