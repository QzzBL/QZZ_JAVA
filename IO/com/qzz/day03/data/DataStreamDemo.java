package com.qzz.day03.data;

import java.io.*;

import static javax.imageio.ImageIO.read;

/**
 * @ClassName DataStreamDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/23 16:31
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//数据流
public class DataStreamDemo {
    public static void main(String[] args) throws Exception {
        File f = new File("H:\\789\\data.txt");
        write(f);
        read(f);
    }
    private static void read(File f) throws Exception {
        DataInputStream in = new DataInputStream(new FileInputStream(f));
        System.out.println(in.readByte());
        System.out.println(in.readChar());
        System.out.println(in.readUTF());
        in.close();
    }
    private static void write(File f) throws Exception {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(f));
        out.writeByte(65);
        out.writeChar('哥');
        out.writeUTF("教育");
        out.close();
    }
}
