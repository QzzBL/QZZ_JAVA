package com.qzz.day01.list;

import java.util.Vector;

/**
 * @ClassName VectorDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/11 10:24
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector(5);
        v.addElement("A");
        //v.addElement(new java.util.Date());
        v.addElement(123);

        System.out.println(v);
        //System.out.println(new java.util.Date());

        StringBuilder sb = new StringBuilder("ABC");
        v.addElement(sb);
        System.out.println(v);
        sb.append("Qzz");
        System.out.println(v);
        System.out.println(sb);
    }
}
