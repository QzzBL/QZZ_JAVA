package com.qzz.day01_01_connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @ClassName ConnectionTest
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/28 13:12
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//获取JDBC连接对象
//操作JDBC的第一步，获取JDBC的连接对象：Connection
public class ConnectionTest {

    //方式1：手动加载注册驱动
    public void test1() throws Exception {
        //1：加载注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2：获取连接点对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "1998516");
    }

    //方式2：从JDK1.6开始，自动加载注册驱动（不建议）
    public void test2() throws Exception {
        //1：获取连接点对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "1998516");

    }
}
