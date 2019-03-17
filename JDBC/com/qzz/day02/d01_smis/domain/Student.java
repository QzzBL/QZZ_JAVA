package com.qzz.day02.d01_smis.domain;

/**
 * @ClassName student
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/28 18:46
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//学生对象
public class Student {
    private Long id;//主键
    private String name;//姓名
    private Integer age;//nianl

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
