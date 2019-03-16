package com.qzz.day02.day02_02.file_writer_reader;

import java.io.*;
import java.util.Arrays;

/**
 * @ClassName FileCopyDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/22 10:33
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//使用文件字符流完成文件的拷贝(纯文本文件)
public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        //1:创建源和目标对象
        File srcFile = new File("H:\\789\\copy.txt");
        File destFile = new File("H:\\789\\copyed.txt");
        //2:创建输入流和输出流对象
        Reader in = new FileReader(srcFile);
        Writer out = new FileWriter(destFile);
        //3:读和写操作
        char[] buffer = new char[111];
        int len = -1;
        //len = in.read(buffer);
        while ((len = in.read(buffer))!= -1) {
            out.write(buffer, 0, len);
        }
        //4:关闭资源
        in.close();
        out.close();
    }
}
