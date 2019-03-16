package com.qzz.day02.day02_02.file_writer_reader;

import java.io.*;

/**
 * @ClassName FileReaderDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/22 9:13
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//文件的字符输入流
public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        //1:创建源
        File srcFile = new File("H:\\789\\qzz.txt");
        //2:创建流对象
        Reader in = new FileReader(srcFile);
        //3:读取操作
        /**
         * int read(): 读取一个字符，读取到末尾返回-1
         * int read(char[] buffer): 读取多个字符，把读取对的字符存储到buffer数组中，读取到末尾返回-1
         */
        //System.out.println((char)in.read());
        char[] buffer = new char[5];//每次只能读取5个字符
        int len = -1;;//表示当前读取字符的数量

        len = in.read(buffer);
        while (len != -1) {
            System.out.println(buffer);
            len = in.read(buffer);
        }
        //4:关闭流
        in.close();
    }
}
