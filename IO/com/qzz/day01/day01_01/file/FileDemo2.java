package com.qzz.day01.day01_01.file;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName FileDemo2
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/20 20:55
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        //创建File对象,表示了几种构造器
        /*File f1 = new File("H:\\All\\abc\\123.txt");
        File f2 = new File("H:/All/abc", "123.txt");

        File dir = new File("H:/All/abc");
        File f3 = new File(dir, "123.txt");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);*/

        //===================================================
        //test1();
        //test2();
        //test3();
        test4();
    }
    /*
    操作File路径和名称
    File getAbsoluteFile(): 获取绝对路径
    String getAbsolutePath: 获取绝对路径
    String getPath(): 获取文件路径
    String getName():获取文件名称
    File getParentFile: 获取上级目录文件
    String getParent(): 获取上级目录路径
     */
    private static void test1() {
        //创建File对象
        File f1 = new File("H:/All/abc/123.txt");
        System.out.println(f1.getAbsolutePath());// H:\All\abc\123.txt
        System.out.println(f1.getAbsoluteFile());// H:\All\abc\123.txt

        System.out.println(f1.getName());// 123.txt
        System.out.println(f1.getPath());// H:\All\abc\123.txt

        System.out.println(f1.getParent());// H:\All\abc
        System.out.println(f1.getParentFile());// H:\All\abc
    }

    /*
    检测File状态的方法
    boolean canExecute(): 判断是否是可执行文件
    boolean canRead(): 判断该文件是否可读
    boolean canWrite(): 判断该文件是否可写
    boolean isHidden(): 判断该文件是否隐藏
    long lastModified(): 判断该文件的最后修改时间
    long length(): 获取该文件的长度大小(单位字节)
     */

    private static void test2() {
        File f1 = new File("H:/All/abc/123.txt");
        System.out.println(f1.canExecute());
        System.out.println(f1.canRead());
        System.out.println(f1.canWrite());
        System.out.println(f1.isHidden());
        System.out.println(f1.lastModified());
        System.out.println(new java.util.Date(f1.lastModified()).toLocaleString());
        System.out.println(f1.length());

        //也有设置是否只读，可写等的方法
    }

    /*
    File类中方法-文件操作
    boolean isFile(): 是否是文件
    boolean createNewFile(): 创建新的文件
    static File createTempFile(String prefix, String suffix): 创建临时文件
    boolean delete(): 删除文件
    void deleteOnExit(): 在JVM停止时删除文件
    boolean exists(): 判断文件是否存在
    boolean renameTo(File dest): 重新修改名称
     */

    private static void test3() throws IOException {
        /*File dir = new File("H:/All/abc");
        File f1 = new File(dir,"123.txt");
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
        if (!f1.exists()) {
            f1.createNewFile();
        }else {
            //f1.renameTo(new File(dir,"xx.txt"));
            f1.delete();
        }*/

        //创建临时文件（临时使用的文件，随时都可以被清除掉）
        //File.createTempFile("will_","xxx.tmp",null);// null 存储到默认的临时目录里面去
        File.createTempFile("will_","xxx.txt", new File("H:/"));
        /*
         if (suffix == null)
            suffix = ".tmp";
         */
    }
    /*
    File类中方法-目录操作
    boolean isDirectory() :判断是否是目录
    boolean mkdir(): 创建当前目录
    boolean mkdirs(): 创建当前目录和上级目录
    String[] list(): 列出所有的文件名
    Filep[] listFiles(): 列出所有文件对象
    static File[] listRoots(): 列出系统盘符
      boolean renameTo(File dest): 重新修改名称
      boolean delete(): 删除文件
    void deleteOnExit(): 在JVM停止时删除文件
    boolean exists(): 判断文件是否存在
     */

    private static void test4() {
        /*File dir = new File("H:/All/abc");
        File f1 = new File(dir,"123.txt");
        System.out.println(dir.isDirectory());// true
        System.out.println(f1.isDirectory());// false

        System.out.println(dir.exists());*/

        File dir = new File("H:/123");
        File dir2 = new File("H:/123/456/789");
        boolean ret = dir.mkdir();//只能创建单级目录
        dir2.mkdirs();
        System.out.println(ret);
        System.out.println("=========================");
        String[] names = dir2.list();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("=========================");
        File[] fs = dir2.listFiles();
        for (File file : fs) {
            System.out.println(file);
        }
        System.out.println("=========================");
        File[] roots = File.listRoots();
        for (File root : roots) {
            System.out.println(root);
        }

/*
        false
=========================
a.txt
b.txt
c
=========================
H:\123\456\789\a.txt
H:\123\456\789\b.txt
H:\123\456\789\c
=========================
C:\
D:\
E:\
F:\
G:\
H:\
*/

    }

}
