package com.qzz.day02.map;

import java.util.*;

/**
 * @ClassName StudentDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/20 11:20
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class StudentDemo {
    public static void main(String[] args) {
        //使用Set集合存储一个班级学生的名称
        Set<String> name1 = new HashSet<>();
        name1.add("值子");
        name1.add("玲子");

        Set<java.lang.String> name2 = new HashSet<>();
        name2.add("值子");
        name2.add("玲子");

        //使用Map来存储多个班级的学生
        //学院A
        Map<String, Set<String>> classMap1 = new TreeMap<>();
        classMap1.put("1班", name1);
        classMap1.put("2班", name2);

        //学院B
        Map<java.lang.String, Set<java.lang.String>> classMap2 = new TreeMap<>();
        classMap2.put("3班", name1);
        classMap2.put("4班", name2);

        //使用List来存储所有学院的学生姓名
        List<Map<String, Set<String>>> school = new ArrayList<>();
        school.add(classMap1);
        school.add(classMap2);

        System.out.println(school);
    }
}
