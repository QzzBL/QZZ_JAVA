package com.qzz.day01.day01_01.stream;

import java.io.*;

/**
 * @ClassName CloseResourceDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/21 20:56
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//正确关闭资源和处理异常
public class CloseResourceDemo {
    public static void main(String[] args) {
        //test1();
        test2();
    }

    //Java7提供的自动资源关闭
    private static void test2() {
        //1:创建源和目标
        File srcFile = new File("H:\\135\\123.txt");
        File destFile = new File("H:\\135\\357.txt");
        try (
                //打开资源的代码
                //2:创建输入的管道（输入流/输出对象）
                InputStream in = new FileInputStream(srcFile);
                OutputStream out = new FileOutputStream(destFile);
        ) {
            //可能出现异常的代码
            //3:读取/写出操作
            byte[] buffer = new byte[10];//创建容量为10的缓冲区（存储已经读取的字节数据）
            int len = -1;//表示已经读取了多少个字节数，如果是-1标明文件已经读到最后

            while (( len = in.read(buffer) ) != -1) {
                //打印一下：读取的数据
                System.out.println(new String(buffer, 0, len));
                //数据在buffer数组中
                out.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void test1() {
        //声明资源对象
        InputStream in = null;
        OutputStream out = null;
        try {
            //可能出现异常的代码
            //1:创建源和目标
            File srcFile = new File("H:\\135\\123.txt");
            File destFile = new File("H:\\135\\357.txt");
            //2:创建输入的管道（输入流/输出对象）
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(destFile);
            //3:读取/写出操作
            byte[] buffer = new byte[10];//创建容量为10的缓冲区（存储已经读取的字节数据）
            int len = -1;//表示已经读取了多少个字节数，如果是-1标明文件已经读到最后

            while (( len = in.read(buffer) ) != -1) {
                //打印一下：读取的数据
                System.out.println(new String(buffer, 0, len));
                //数据在buffer数组中
                out.write(buffer, 0, len);
            }
        } catch (Exception e) {
            //处理异常
            e.printStackTrace();
        } finally {
            //关闭资源
            //4:关闭管道(资源)
            try {
                if (in != null) {
                    in.close();// close()设计本身就有异常
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (out != null) {
                    out.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
