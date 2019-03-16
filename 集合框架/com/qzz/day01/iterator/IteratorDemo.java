package com.qzz.day01.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName IteratorDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/11 15:10
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//集合元素迭代/遍历操作
public class IteratorDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        //方式1：for循环
        for (int index = 0; index < list.size(); index++) {
            Object ele = list.get(index);
            System.out.println(ele);
        }
        System.out.println("----------------------------");

        //方式2：for-each增强for循环
        /*
        for(类型 变量:数组名/Iterable的实例){
              //TODO
        }
         */
        for (Object ele:list) {
            System.out.println(ele);
        }
        System.out.println("----------------------------");

        //方式3：使用while循环操作迭代器Iterator //for-each底层用的是迭代器
        Iterator it = list.iterator();//返回一个迭代器对象

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("----------------------------");
        //方式4：使用for循环操作迭代器Iterator
        for (Iterator it2 = list.iterator();it2.hasNext();) {
            System.out.println(it2.next());
        }
    }
}
