package com.qzz.day02.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @ClassName HashSetDemo3
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/19 10:03
 * @Title 愿上苍有好生之德
 * @Description:
 **/
class Student {
    private int sn;// 学号
    private String name;
    private int age;

    public Student(int sn, String name, int age) {
        super();// 调用Object无参构造方法
        this.sn = sn;
        this.name = name;
        this.age = age;
    }

    //在这里选定的是学号和名字只要相同，就为同一个对象
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sn == student.sn &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sn, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "sn=" + sn +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class HashSetDemo3 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student(1, "赵一", 17));
        set.add(new Student(1, "赵一", 17));
        set.add(new Student(2, "李四", 18));
        set.add(new Student(3, "李四", 18));
        System.out.println(set.size());
        System.out.println(set);
    }
}
