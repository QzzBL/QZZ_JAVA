package com.qzz.day02.util;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @ClassName ArraysDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/20 11:39
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class ArraysDemo {
    public static void main(String[] args) {
        //把数组转换成List对象
        String[] arr = {"A", "B", "C", "D"};
        //List<Date> a = Arrays.asList(new Date());
        //System.out.println(a);
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
        list.set(3, "A");
        System.out.println(list);
        //list.remove(0);  此时报错：UnsupportedOperationException
        //因为用了asList后致使长度变成固定的，可以修改，但是不能增加和删除

        //======================================================
        //可以自动装箱，看成是Integer
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        //定义了int类型的数组
        int[] arr2 = {1, 2, 3, 4, 5};
        //直接把数组当做是对象
        List<int[]> list2 = Arrays.asList(arr2);
        System.out.println(list1);
        System.out.println(list2);
    }
}
