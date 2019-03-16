package com.qzz.day03.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @ClassName ScannerDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/23 10:56
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//扫描类
public class ScannerDemo {
    public static void main(String[] args) throws Exception {
        //扫描文件中的数据
        //Scanner sc = new Scanner(new File("H:\\789\\qzz.txt"),"GBK");
        //扫描键盘输入的数据
        //Scanner sc = new Scanner(System.in);
        //扫描字符串中的数据
        Scanner sc = new Scanner("你好帅啊");
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println("ECHO: " + line);
        }
        sc.close();
    }
}
