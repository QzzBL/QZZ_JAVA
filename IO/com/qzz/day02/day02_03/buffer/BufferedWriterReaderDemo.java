package com.qzz.day02.day02_03.buffer;

import java.io.*;

/**
 * @ClassName BufferedWriterReaderDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/22 15:26
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class BufferedWriterReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter("H:\\789\\BufferedWriterReaderStream.txt"));
        out.write("君不见黄河之水天上来");
        out.newLine();
        out.write("奔流到海不复还");
        out.close();
        //输入
        BufferedReader in = new BufferedReader(new FileReader("H:\\789\\BufferedWriterReaderStream.txt"));
      /*  char[] buffer = new char[1024];
        int len = -1;
        while ((len = in.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, len));
        }*/
        String line = null;//表示读取的行
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
}
