package com.qzz.day01.d02_ddl_catch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLOutput;
import java.sql.Statement;

/**
 * @ClassName DDLTest
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/28 13:55
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//使用JDBC创建一张表
public class DDLTest {

    //需要：创建一张 t_student表：id/name/age：
    public static void main(String[] args) throws Exception {
        String sql = "CREATE TABLE t_student(id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(20), age INT)";
        //1：加载注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2：获取链接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "1998516");
        //3：创建语句对象
        Statement st = conn.createStatement();
        //4：执行SQL
        int rows = st.executeUpdate(sql);
        //System.out.println(rows);
        //5：释放资源
        st.close();
        conn.close();
    }
}
