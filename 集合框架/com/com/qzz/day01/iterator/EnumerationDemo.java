package com.qzz.day01.iterator;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @ClassName EnumerationDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/11 15:41
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class EnumerationDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        //古老的迭代器对象
        Enumeration en = v.elements();
        while (en.hasMoreElements()){
            Object ele = en.nextElement();
            System.out.println(ele);
        }
    }
}
