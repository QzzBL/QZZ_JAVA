package com.qzz.day02.set;

import javafx.scene.effect.SepiaTone;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName HashSetDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/20 12:14
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("X");
        set.add("A");
        set.add("1");
        set.add("C");
        set.add("0");
        //System.out.println(set);//根据HashCode 计算其位置 [0, A, 1, C, X]

        Set<String> set2 = new HashSet<>();
        set2.add("7");
        set2.add("8");
        set2.add("9");

        set.addAll(set2);
        System.out.println(set);
        System.out.println(set.contains("9"));

        for (String ele : set) {
            System.out.println(ele);
        }
        System.out.println("====================================");
        //边迭代，边删除
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("====================================");
        //remove(）方法
        System.out.println(set.remove("7"));
        System.out.println(set);

        System.out.println("====================================");
        set.removeAll(set2);
        System.out.println(set);

        System.out.println("====================================");
        //仅仅保留"9",其他删除
        set2.retainAll(Collections.singleton("9"));
        System.out.println(set2);
    }
}
