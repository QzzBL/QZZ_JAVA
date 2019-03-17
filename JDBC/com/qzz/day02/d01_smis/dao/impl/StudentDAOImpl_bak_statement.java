package com.qzz.day02.d01_smis.dao.impl;

import com.qzz.day02.d01_smis.dao.IStudentDAO;
import com.qzz.day02.d01_smis.domain.Student;
import com.qzz.util.JdbcUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
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
public class StudentDAOImpl_bak_statement implements IStudentDAO {
    @Override
    //INSERT INTO t_student(name,age) VALUES('XX',17)
    public void save(Student student) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO t_student(name,age) VALUES(");
        sql.append("'").append(student.getName()).append("'");
        sql.append(",").append(student.getAge());
        sql.append(")");
        Connection conn = null;
        Statement st = null;
        try {
            //1：加载注册驱动
            //2：获取链接对象
            conn = JdbcUtil.getConn();
            //3：创建语句对象
            st = conn.createStatement();
            //4：执行SQL
           st.executeUpdate(sql.toString());//StringBuilder-->String
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.close(conn, st, null);
        }
    }

    @Override
    public void delete(Long id) {
        String sql = "DELETE FROM t_student WHERE id = " + id;
        Connection conn = null;
        Statement st = null;
        try {
            //1：加载注册驱动
            //2：获取链接对象
            conn = JdbcUtil.getConn();
            //3：创建语句对象
            st = conn.createStatement();
            //4：执行SQL
            st.executeUpdate(sql);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.close(conn, st, null);
        }
    }

    @Override
    //UPDATE t_student SET name = 'wqq',age = 20 WHERE id = 3
    public void updata(Long id, Student newStu) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE t_student SET name = ");
        sql.append("'").append(newStu.getName()).append("'");
        sql.append(",").append("age = ").append(newStu.getAge());
        sql.append(" WHERE id = ").append(id);

        System.out.println(sql);
        Connection conn = null;
        Statement st = null;
        try {
            //1：加载注册驱动
            //2：获取链接对象
            conn = JdbcUtil.getConn();
            //3：创建语句对象
            st = conn.createStatement();
            //4：执行SQL
            st.executeUpdate(sql.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(conn, st, null);
        }
    }

    @Override
    public Student get(Long id) {
        String sql = "SELECT * FROM t_student WHERE id = " + id;
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            //1：加载注册驱动
            //2：获取链接对象
            conn = JdbcUtil.getConn();
            //3：创建语句对象
            st = conn.createStatement();
            //4：执行SQL
            rs = st.executeQuery(sql);
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
            JdbcUtil.close(conn, st, rs);
        }
        return null;
    }

    @Override
    public List<Student> list() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM t_student";
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            //1：加载注册驱动
            //2：获取链接对象
            conn = JdbcUtil.getConn();
            //3：创建语句对象
            st = conn.createStatement();
            //4：执行SQL
            rs = st.executeQuery(sql);
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
            JdbcUtil.close(conn, st, rs);
        }
        return list;
    }
}
