package com.qzz.day02.set;

import java.util.TreeSet;

/**
 * @ClassName TreeSetDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/19 10:50
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Y");
        set.add("D");
        set.add("A");
        set.add("1");
        set.add("6");
        set.add("c");
        set.add("b");
        System.out.println(set);// [1, 6, A, D, Y, b, c]
        System.out.println(set.first());// 1
        System.out.println(set.last());// c
        System.out.println(set.headSet("A"));// [1, 6]
    }
}
