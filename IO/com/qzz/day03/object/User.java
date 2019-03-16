package com.qzz.day03.object;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/22 21:43
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//需要序列化的对象
public class User implements Serializable {
    private String name;
    transient   String password;
    private int age;

    public User(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
