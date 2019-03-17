package com.qzz.day02.d01_smis.test;

import com.qzz.day02.d01_smis.dao.IStudentDAO;
import com.qzz.day02.d01_smis.dao.impl.StudentDAOImpl;
import com.qzz.day02.d01_smis.domain.Student;

import java.util.List;

/**
 * @ClassName StudentDAOTest
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/28 19:36
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class StudentDAOTest {
    public static void main(String[] args) {
        //testGet();
        testList();
        //testSave();
        //testUpdate();
        //testDelete();
    }

    //依赖DAO对象
    private static IStudentDAO dao = new StudentDAOImpl();

    public static void testSave() {
        Student student = new Student();
        student.setName("SZL");
        student.setAge(17);
        dao.save(student);
    }

    public static void testDelete() {
        dao.delete(4L);
    }

    public static void testUpdate() {
        Student student = new Student();
        student.setName("qzz");
        student.setAge(20);
        dao.updata(5L, student);
    }

    public static void testGet() {
        Student stu = dao.get(1L);
        System.out.println(stu);
    }

    public static void testList() {
        List<Student> list = dao.list();
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
