package com.qzz.day03.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @ClassName LoadResourceDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/23 11:18
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class LoadResourceDemo {
    public static void main(String[] args) throws Exception {
        //创建Properties对象
        Properties p = new Properties();
        InputStream inputStream = new FileInputStream("H:\\789\\properties.txt");
        //加载输入流中的数据，加载之后，数据都在p对象中
        p.load(inputStream);

        System.out.println(p);
        System.out.println("账号："+p.getProperty("username"));
        System.out.println("密码："+p.getProperty("password"));
    }
}
