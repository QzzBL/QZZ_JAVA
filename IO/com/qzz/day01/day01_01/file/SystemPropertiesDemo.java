package com.qzz.day01.day01_01.file;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName SystemPropertiesDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/21 18:11
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class SystemPropertiesDemo {
    public static void main(String[] args) {
        Properties pro = System.getProperties();
        Set<Map.Entry<Object, Object>> entrySet = pro.entrySet();
        for (Map.Entry<Object, Object> entry : entrySet) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        System.out.println("=========================");

        String val = System.getProperty("user.dir");
        System.out.println(val);
    }
}
