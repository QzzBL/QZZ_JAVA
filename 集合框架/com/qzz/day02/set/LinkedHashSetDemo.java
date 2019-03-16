package com.qzz.day02.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @ClassName LinkedHashSetDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/19 10:37
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        /*Set<String> set = new HashSet<>();
        set.add("X");
        set.add("C");
        set.add("B");
        set.add("1");
        set.add("2");
        System.out.println(set);//[1, B, 2, C, X] 不记录添加顺序*/

        Set<String > set = new LinkedHashSet<>();
        set.add("X");
        set.add("C");
        set.add("B");
        set.add("1");
        set.add("2");
        System.out.println(set);//[X, C, B, 1, 2] 记录了从头开始的添加的顺序
    }
}
