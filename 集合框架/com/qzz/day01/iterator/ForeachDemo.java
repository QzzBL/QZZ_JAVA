package com.qzz.day01.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ForeachDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/11 16:11
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class ForeachDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        //边做迭代边删除，只能用迭代器，而且只能用迭代器的删除remove()方法

       //集合的删除方法，无法删除掉Iterator中的指定元素
       /*for (Object ele : list) {

            //删除集合中为C字符串的元素
            if("B".equals(ele)) {//ConcurrentModificationException  叫做：并发修改异常
                list.remove(ele);
            }
        }
        System.out.println(list);*/
       //用迭代器的删除方法，先获得迭代器的对象

        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object ele = it.next();
            if("B".equals(ele)) {
                //list.remove(ele);//不能使用集合的删除方法
                it.remove();
            }
        }
        System.out.println(list);
    }
}
