package com.qzz.day01.day01_01.stream;

import java.io.*;

/**
 * @ClassName StreamCopyDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/21 20:44
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class StreamCopyDemo {
    public static void main(String[] args) throws IOException {
        //1:创建源和目标
        File srcFile = new File("H:\\135\\123.txt");
        File destFile = new File("H:\\135\\357.txt");
        //2:创建输入的管道（输入流/输出对象）
        InputStream in = new FileInputStream(srcFile);
        OutputStream out = new FileOutputStream(destFile);
        //3:读取/写出操作
        byte[] buffer = new byte[10];//创建容量为10的缓冲区（存储已经读取的字节数据）
        int len = -1;//表示已经读取了多少个字节数，如果是-1标明文件已经读到最后

        while ((len = in.read(buffer)) != -1) {
            //打印一下：读取的数据
            System.out.println(new String(buffer,0 , len));
            //数据在buffer数组中
            out.write(buffer, 0 ,len);
        }
        //4:关闭管道(资源)
        in.close();
        out.close();
    }
}
