package com.qzz.day02.map;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @ClassName PropertiesDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/20 10:12
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        //是Map的实现类，是Hashtable的子类
        Properties p = new Properties();
        //key和value都是string类型
        p.setProperty("username", "root");
        p.setProperty("password", "admin");
        System.out.println(p);
        //根据key获取value值
        String val = p.getProperty("username", "key不存在时的默认值，这这个位置也可以不要");
        System.out.println(val);

        //加载资源文件
        InputStream inputStream = null;
        p.load(inputStream);
    }
}
