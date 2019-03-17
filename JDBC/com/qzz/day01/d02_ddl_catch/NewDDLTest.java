package com.qzz.day01.d02_ddl_catch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @ClassName NewDDLTest
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/28 14:17
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//正常处理异常和关闭资源
public class NewDDLTest {
    public static void main(String[] args) {
        String sql = "CREATE TABLE t_student(id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(20), age INT)";

       //声明资源对象
        Connection conn = null;
        Statement st = null;
        try {
            //1：加载注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2：获取链接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "1998516");
            //3：创建语句对象
            st = conn.createStatement();
            //4：执行SQL
            st.executeUpdate(sql);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            //5：释放资源
            try {
                if (st != null) {
                    st.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
