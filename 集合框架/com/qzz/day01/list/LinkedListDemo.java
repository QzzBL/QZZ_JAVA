package com.qzz.day01.list;

import java.util.LinkedList;

/**
 * @ClassName LinkedListDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/11 13:38
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast("B");
        list.addLast("C");
        list.addLast("D");
        System.out.println(list);

        list.addFirst("A");
        System.out.println(list);
        System.out.println(list.get(1));
    }
}
