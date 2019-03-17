/**
 * @ClassName Comparable
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/2 17:13
 * @Title 愿上苍有好生之德
 **/
//import java.lang.reflect.Array;
import java.util.*;

import java.util.Comparator;
class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double score;

    public Student (String name,int age,double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

/*  @Override
    public int compareTo(Student o) {
        //return name.compareTo(o.name);
        return age-o.age;
    }*/
}

public class Comparable {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("gaobo", 48, 99.0);
        students[1] = new Student("aangzhuo", 28, 49.0);
        students[2] = new Student("yangliu", 18, 59.9);
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

 /*       Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //return o1.getAge() - o2.getAge();
                //return (int)(o1.getScore() - o2.getScore());
                return o1.getName().compareTo(o2.getName());
            }
        });*/

                System.out.println(Arrays.toString(students));
    }
}

