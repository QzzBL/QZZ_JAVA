package com.qzz.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @ClassName JdbcUtil
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/29 8:45
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class JdbcUtil {
    private static String driverClassName = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/jdbcdemo";
    private static String username = "root";
    private static String password = "1998516";

    //private static Properties p = new Properties();

    //当啊JdbcUtil的这份字节码被加载进JVM，就先执行静态代码块
    static {
/*
        try {
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            //从classpath的根路径去寻找db.properties文件
            InputStream inputStream = loader.getResourceAsStream("db.properties");
            p.load(inputStream);//load之后（及加载之后），数据都在Properties中
        } catch (IOException e) {
            throw new RuntimeException("加载classpath根路径下的db.properties文件失败");
        }
*/

        //1：加载注册驱动
        try {
            Class.forName(driverClassName);
            //Class.forName(p.getProperty("driverClassName"));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("数据库驱动加载失败", e);
        }
    }

    //返回创建好的Connection对象
    public static Connection getConn() {
        try {//connection是线程不安全的，不能放进静态代码块中只执行一次，必须保证每次都要用一个新的
            //2：获取链接对象
            //return DriverManager.getConnection(p.getProperty("url"), p.getProperty("username"), p.getProperty("password"));
            return DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new RuntimeException("数据库连接异常");
    }

    //释放资源
    public static void close(Connection conn, Statement st, ResultSet rs) {
    //5：释放资源
            try {
        if(rs != null) {
            rs.close();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }finally {
        try {
            if (st != null) {
                st.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

    //不让外界创建对象，直接用类名调用
    private JdbcUtil(){}
}
