package com.qzz.day03.random;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import static javax.imageio.ImageIO.read;

/**
 * @ClassName RandomAccessFileDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/23 16:46
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class RandomAccessFileDemo {
    public static void main(String[] args) throws Exception {
        File f = new File("H:\\789\\random.txt");
        write(f);
        read(f);
    }
    private static void read(File f) throws Exception {
        RandomAccessFile raf = new RandomAccessFile(f, "r");
        System.out.println("文件指针位置："+raf.getFilePointer());
        byte b = raf.readByte();
        System.out.println(b);
        String str = raf.readUTF();
        System.out.println(str);
        raf.seek(0);
        System.out.println("文件指针位置："+raf.getFilePointer());
        int i = raf.readInt();
        System.out.println(i);
        System.out.println("文件指针位置："+raf.getFilePointer());
        raf.close();
        }
    private static void write(File f) throws Exception {
        RandomAccessFile raf = new RandomAccessFile(f, "rw");
        raf.writeByte(65);
        raf.writeUTF("小老哥");//使用的是修改之后的UTF-8,多了两个字节
        raf.writeInt(17);
        raf.close();
    }
}
