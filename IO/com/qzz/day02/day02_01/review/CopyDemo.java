package com.qzz.day02.day02_01.review;

import java.io.*;

/**
 * @ClassName CopyDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/22 8:01
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//案列1: 文件拷贝案列。拷贝指定目录的指定类型文件到指定目录
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        //1:找到源目录中所有的java文件
        File srcDir = new File("H:\\789\\java");
        File destDir = new File("H:\\789\\text");
        File[] fs = srcDir.listFiles(new FilenameFilter() {//过滤，只要.java文件
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isFile() && name.endsWith(".java");
            }
        });
        //2: 迭代出每一个文件对象，并拷贝
        for (File srcFile : fs) {
            // 创建流对象
            InputStream in = new FileInputStream(srcFile);
            OutputStream out = new FileOutputStream(new File(destDir, srcFile.getName()));
            //读写操作
            byte[] buffer = new byte[1024];// 一次性可以读1024个字节
            int len = -1;// 表示已经读取的字节数，在底层规定是-1读取到末尾
            len = in.read(buffer);
            while (len != -1) {
                out.write(buffer, 0, len);
                len = in.read(buffer);
            }
            //关闭资源
            in.close();
            out.close();
        }
    }
}
