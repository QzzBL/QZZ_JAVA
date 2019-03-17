package com.qzz.day02.d01_smis.dao;

import com.qzz.day02.d01_smis.domain.Student;

import java.util.List;

/**
 * 包含Student对象的CRUD操作
 */
public interface IStudentDAO {
    /**
     * 保存学生对象
     * @param student 需要保存的学生对象
     */
    void save(Student student);

    /**
     * 删除指定学生对象
     * @param id     被删除学生的主键值
     */
    void delete(Long id);

    /**
     * 修改指定id的学生对象信息
     * @param id      被修改学生对象的主键
     * @param newStu  新的学生对象信息
     */
    void updata(Long id, Student newStu);

    /**
     * 查询指定id 的学生对象
     * @param id   指定的id
     * @return     如果存在该id，则返回该id 对于的学生对象，否则返回null
     */
    Student get(Long id);

    /**
     * 查询所有的学生对象
     * @return   所有的学生对象，如果没有学生，返回一个空集
     */
    List<Student> list();
}
