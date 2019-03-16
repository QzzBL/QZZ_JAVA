package com.qzz.day03.object;

import java.io.*;

/**
 * @ClassName ObjectStreamDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/22 21:39
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//使用对象流来实现序列化和反序列化
public class ObjectStreamDemo {
    public static void main(String[] args) throws Exception {
        File f = new File("H:\\789\\Object.txt");
        writerObject(f);
        readObject(f);
    }
    //序列化操作
    private static void writerObject(File f) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
        out.writeObject(new User("will", "12345", 17));
        out.close();
    }
    //反序列化操作
    private static void readObject(File f) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
        User user = (User) in.readObject();
        System.out.println(user);
        in.close();
    }
}
