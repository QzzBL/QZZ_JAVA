package com.qzz.day01.d03_dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @ClassName DMLTest
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/28 15:20
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//针对t_student表做增删改操作
public class DMLTest {
    public static void main(String[] args) throws Exception {
        testInsert();
        //testUpdata();
        //testDelect();
    }
    public static void testInsert() throws Exception {
        //修改操作
        String sql = "INSERT INTO t_student(name,age) VALUES('阿虎',32)";
        //1：加载注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2：获取连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "1998516");
        //3：创建语句对象
        Statement st = conn.createStatement();
        //4：执行SQL
        int rows = st.executeUpdate(sql);
        System.out.println("成功操作：" + rows);
        //5：释放资源
        st.close();
        conn.close();
    }
    public static void testUpdata() throws Exception {
        //更新操作
        String sql = "UPDATE t_student SET name = 'zheshuai', age = 18 WHERE id = 2";
        //1：加载注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2：获取连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "1998516");
        //3：创建语句对象
        Statement st = conn.createStatement();
        //4：执行SQL
        int rows = st.executeUpdate(sql);
        System.out.println("成功操作：" + rows);
        //5：释放资源
        st.close();
        conn.close();
    }
    public static void testDelect() throws Exception {
        //更新操作
        String sql = "DELETE FROM t_student WHERE id = 2";
        //1：加载注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2：获取连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "1998516");
        //3：创建语句对象
        Statement st = conn.createStatement();
        //4：执行SQL
        int rows = st.executeUpdate(sql);
        System.out.println("成功操作：" + rows);
        //5：释放资源
        st.close();
        conn.close();
    }
}
