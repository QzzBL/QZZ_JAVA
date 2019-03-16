package com.qzz.day01.list;

import java.util.Vector;

/**
 * @ClassName VectorMethodDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/11 10:47
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class VectorMethodDemo {
    public static void main(String[] args) {
        test_add();
        //test_remove();
        //test_update();
        //test_inquiry();
    }

    private static void test_inquiry() {
        Vector v1 = new Vector();
        v1.add("A");
        v1.add("B");
        v1.add("C");
        System.out.println(v1.size());
        System.out.println(v1.isEmpty());
        System.out.println(v1.get(2));
        System.out.println(v1.toArray());
    }

    private static void test_update() {
        Vector v1 = new Vector();
        v1.add("A");
        v1.add("B");
        v1.add("C");
        System.out.println(v1);
        Object set = v1.set(1,"will");
        System.out.println(v1);
        System.out.println(set);
    }

    private static void test_remove() {
        Vector v1 = new Vector();
        v1.add("A");
        v1.add("B");
        v1.add("C");
        v1.add("B");
        System.out.println(v1);
        //v1.remove(1);
        v1.remove("B");
        System.out.println(v1);
    }

    private static void test_add() {
        Vector v1 = new Vector();
        v1.add("A");
        v1.add("B");
        v1.add("C");
        //System.out.println(v1);
        //v1.add(1,"will");

        System.out.println(v1);

        Vector v2 = new Vector();
        v2.add(1);
        v2.add(2);
        v2.add(3);

        //v1.add(v2);//[A, B, C, [1, 2, 3]]
        //v1.addAll(v2);//[A, B, C, 1, 2, 3]
        v1.addAll(1,v2);//[A, 1, 2, 3, B, C]
        System.out.println(v1);

        v1.removeAll(v2);
        System.out.println(v1);
    }
}
