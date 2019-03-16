package com.qzz.day02.day02_05.ByteArrayDemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @ClassName ByteArrayDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/22 16:43
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//字节的内存流
public class ByteArrayDemo {
    public static void main(String[] args) throws IOException {
        //字节数组输出流：程序-->内存
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write("ABCDE".getBytes());
        //要使用存储的临时数据
        byte[] buffer = bos.toByteArray();

        //字节数组输入流：内存-->程序
        ByteArrayInputStream bis = new ByteArrayInputStream(buffer);
        byte[] bys = new byte[9];
        int len = -1;
        while ((len = bis.read(bys)) != -1) {
            System.out.println(new String(bys, 0, len));
        }
        bis.close();;
        bos.close();
    }
}
