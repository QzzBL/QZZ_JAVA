package com.qzz.day02.d01_smis.dao.impl;

import com.qzz.day02.d01_smis.dao.IStudentDAO;
import com.qzz.day02.d01_smis.domain.Student;
import com.qzz.util.JdbcUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StudentDAOimpl
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/28 19:33
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class StudentDAOImpl implements IStudentDAO {
    @Override
    //INSERT INTO t_student(name,age) VALUES('XX',17)
    public void save(Student student) {
        String sql = "INSERT INTO t_student(name,age) VALUES(?,?)";
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JdbcUtil.getConn();
            ps = conn.prepareStatement(sql);
            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.execute();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.close(conn, ps, null);
        }
    }

    @Override
    public void delete(Long id) {
        String sql = "DELETE FROM t_student WHERE id = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JdbcUtil.getConn();
            ps = conn.prepareStatement(sql);
            ps.setLong(1, id);
            ps.execute();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.close(conn, ps, null);
        }
    }

    @Override
    //UPDATE t_student SET name = 'wqq',age = 20 WHERE id = 3
    public void updata(Long id, Student newStu) {
        String sql = "UPDATE t_student SET name = ?,age = ? WHERE id = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JdbcUtil.getConn();
            ps = conn.prepareStatement(sql);
            ps.setString(1, newStu.getName());
            ps.setInt(2, newStu.getAge());
            ps.setLong(3, id);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(conn, ps, null);
        }
    }

    @Override
    public Student get(Long id) {
        String sql = "SELECT * FROM t_student WHERE id = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtil.getConn();
            ps = conn.prepareStatement(sql);
            ps.setLong(1, id);
            rs = ps.executeQuery();
            //处理结果集：把结果集中的每一行数据封装成一个对象
            if (rs.next()) {
                Student stu = new Student();
                stu.setId(rs.getLong("id"));
                stu.setName(rs.getString("name"));
                stu.setAge(rs.getInt("age"));
                return stu;
            }

        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.close(conn, ps, rs);
        }
        return null;
    }

    @Override
    public List<Student> list() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM t_student";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtil.getConn();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            //处理结果集：把结果集中的每一行数据封装成一个对象
            while (rs.next()) {
                Student stu = new Student();
                stu.setId(rs.getLong("id"));
                stu.setName(rs.getString("name"));
                stu.setAge(rs.getInt("age"));
                list.add(stu);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.close(conn, ps, rs);
        }
        return list;
    }
}
