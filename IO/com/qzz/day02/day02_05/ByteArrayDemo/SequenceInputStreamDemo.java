package com.qzz.day02.day02_05.ByteArrayDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 * @ClassName SequenceInputStreamDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/22 17:14
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//顺序流/合并流    注意：没有字符的合并流 操作中文尽量使用字符流
public class SequenceInputStreamDemo {
    public static void main(String[] args) throws Exception {
        //创建顺序流对象
        SequenceInputStream in = new SequenceInputStream(new FileInputStream("H:\\789\\hebing1.txt"),
                new FileInputStream("H:\\789\\hebing2.txt"));
        byte[] buffer = new byte[1024];
        int len = -1;
        while ((len = in.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, len));
        }
        in.close();
    }
}
