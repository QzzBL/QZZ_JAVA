package com.qzz.day01.url_connection;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 * @ClassName URLConnectionDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/24 8:47
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//URL对象
public class URLConnectionDemo {
    public static void main(String[] args) throws Exception {
        //https://blog.csdn.net/weixin_44233163/article/details/85862018
        URL url = new URL("https","blog.csdn.net",8080,"weixin_44233163/article/details/85862018");
        //打开URL的链接对象
        URLConnection conn = url.openConnection();
        //InputStream.getInputStream() 返回从此打开的链接读取的输入流
        //网络---输入--->程序中
        InputStream in = conn.getInputStream();
        Scanner sc = new Scanner(in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        in.close();
    }
}
