package com.qzz.day02.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName TreeSetDemo2
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/19 11:13
 * @Title 愿上苍有好生之德
 * @Description:
 **/
class Person implements Comparable<Person>{
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.age > o.age) {
            return 1;
        }else if (this.age < o.age) {
            return -1;
        }
        return 0;
    }
}
public class TreeSetDemo2 {
    public static void main(String[] args) {
        //按照Person对象的年龄自然排序
        Set<Person> set = new TreeSet<>();
        set.add(new Person("西门吹雪", 98));
        set.add(new Person("倩儿", 32));
        set.add(new Person("孙小", 18));
        set.add(new Person("赵", 5));
        System.out.println(set);
        System.out.println("-----------------------------------");
        //按照Person对象的名字长短来定制排序
        Set<Person> set2 = new TreeSet<>(new NameLengthComparator());
        set2.add(new Person("西门吹雪", 98));
        set2.add(new Person("倩儿", 32));
        set2.add(new Person("孙小", 18));
        set2.add(new Person("赵", 5));
        System.out.println(set2);
    }
}

//名字长度的比较器
class NameLengthComparator implements Comparator<Person> {

    //编写比较规则
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.name.length() > o2.name.length()) {
            return 1;
        }else if (o1.name.length() < o2.name.length()) {
            return -1;
        }
        return 0;
    }
}
