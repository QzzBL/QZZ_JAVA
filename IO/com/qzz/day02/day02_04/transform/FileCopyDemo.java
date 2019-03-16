package com.qzz.day02.day02_04.transform;

import java.io.*;

//字节流转字符流完成文件的拷贝
public class FileCopyDemo {
    public static void main(String[] args) throws IOException, FileNotFoundException {

        File srcFile = new File("H:\\789\\copy.txt");
        File destFile = new File("H:\\789\\copyed.txt");

        Reader in = new InputStreamReader(new FileInputStream(srcFile),"GBK");
        Writer out = new OutputStreamWriter(new FileOutputStream(destFile),"GBK");
        char[] buffer = new char[1024];
        int len = -1;

        //接下来就是操作字符流
        while ((len = in.read(buffer))!= -1) {
            out.write(buffer, 0, len);
        }
        in.close();
        out.close();
    }
}
