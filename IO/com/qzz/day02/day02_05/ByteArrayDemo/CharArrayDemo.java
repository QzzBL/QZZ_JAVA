package com.qzz.day02.day02_05.ByteArrayDemo;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

/**
 * @ClassName CharArrayDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/22 16:56
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//字符内存流/数组流
public class CharArrayDemo {
    public static void main(String[] args) throws Exception {
        //字符数组输出流
        CharArrayWriter writer = new CharArrayWriter();
        writer.write("曹德旺");
        char[] data = writer.toCharArray();
        //字符数组输入流
        CharArrayReader reader = new CharArrayReader(data);
        System.out.println((char) reader.read());
        System.out.println((char) reader.read());
        System.out.println((char) reader.read());
    }
}
