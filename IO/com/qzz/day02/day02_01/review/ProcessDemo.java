package com.qzz.day02.day02_01.review;

import java.io.*;

/**
 * @ClassName ProcessDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/22 8:23
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class ProcessDemo {
    public static void main(String[] args) throws IOException {
        String str = "System.out.println(\"你是天边最美的云彩\")";
        eval(str);
    }
    //执行str参数，并在控制台打印出：你是天边最美的云彩
    private static void eval(String str) throws IOException {
        //1:使用StringBuilder拼接一个完整的HelloWorld程序
        StringBuilder sBuilder = new StringBuilder(80);// 拼接性能高
        sBuilder.append("public class Hello {");
        sBuilder.append("public static void main(String[] args) {");
        sBuilder.append(str);
        sBuilder.append(";");
        sBuilder.append("}");
        sBuilder.append("}");
        //2:保存到一个名叫Hello.java的文件中
        OutputStream out = new FileOutputStream("H:\\789\\Hello.java");
        out.write(sBuilder.toString().getBytes());
        out.close();
        //3:调用javac进程来编译Hello.java
        Process javacProcess = Runtime.getRuntime().exec("javac Hello.java");
        //4:读取javac进程中错误流信息
        InputStream error = javacProcess.getErrorStream();
        //读取流中的数据
        byte[] buffer = new byte[1024];
        int len = -1;
        while ((len = error.read(buffer)) != -1) {
            String msg = new String(buffer,0, len);
            System.out.println(msg);
        }
        error.close();
        //5:调用java进程来运行Hello.class
        Process javaProcess = Runtime.getRuntime().exec("java Hello");
        //6:读取java进程中的流信息
        InputStream info = javaProcess.getInputStream();
        while ((len = info.read(buffer)) != -1) {
            String msg = new String(buffer, 0, len);
            System.out.println(msg);
        }
        info.close();
        //删除java和class文件
        /*new File("Hello.java").delete();
        new File("Hello.class").delete();*/

    }
}
