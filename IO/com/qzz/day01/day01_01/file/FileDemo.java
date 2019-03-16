package com.qzz.day01.day01_01.file;

import java.io.File;

/**
 * @ClassName FileDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/20 20:26
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class FileDemo {
    public static void main(String[] args) {
        /*
        static String pathSeparator
        static char pathSeparatorChar
        static String separator
        static char separatorChar
         */
        //获取属性分割符
        String pathSeparator = File.pathSeparator;
        char pathSeparatorChar = File.pathSeparatorChar;
        System.out.println(pathSeparator + "-----" + pathSeparatorChar);// ;-----;
        //获取路径分隔符
        String separator1 = File.separator;
        char separatorChar1 = File.separatorChar;
        System.out.println(separator1 + "-----" + separatorChar1);// \-----\
        //表示一个文件路径
        String path1 = "c:\\will\\123.txt";
        String path2 = "c:/will/123.txt";//一般写方式这种，因为两种平台都支持
        String path3 = "c:" + File.separator + "will" + File.separator + "123.txt";// 可跨平台
    }
}
