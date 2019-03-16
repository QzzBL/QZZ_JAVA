package com.qzz.day02.day02_02.file_writer_reader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @ClassName FileWriterDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/22 9:34
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//文件的字符输出流
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        //1:创建目标
        File destFile = new File("H:\\789\\writer.txt");
        //2:创建字符输出流对象
        Writer out = new FileWriter(destFile, false);


        //3:写出操作

        /**
         * void writer(int c):向外写出一个字符
         * void writer(char[] buffer):向外写出多个字符(buffer)
         * void writer(char[] buffer, int off, int len):把buffer数组中指定对的字符写出去
         * void write(String str):直接向外写出一个字符串
         */
        //out.write('A');
        //out.write("Will".toCharArray());
        //out.write("ASDFGHJKL".toCharArray(), 2, 5);
        out.write("ASDFGHJKL");
        //out.write("\B");// Error:(37, 21) java: 非法转义符
        out.write("ASDFGHJKL");
        //4:关闭资源
        out.close();
    }
}
