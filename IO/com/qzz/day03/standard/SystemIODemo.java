package com.qzz.day03.standard;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @ClassName SystemIODemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/23 10:35
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//标准的IO操作
public class SystemIODemo {
    public static void main(String[] args) throws Exception {
        /*System.out.println("...begin...");
        int data = System.in.read();
        System.out.println(data);
        System.out.println("...end...");*/
        //====================================
        //重定向标准输入流
        System.setIn(new FileInputStream("H:\\789\\qzz.txt"));
        //重定向标准输出流
        //System.setOut(new PrintStream("H:\\789\\IO.txt"));

        System.out.println("...begin...");
        int data = System.in.read();
        System.out.println(data);
        System.out.println("...end...");

        System.err.println("xxx");
    }
}
