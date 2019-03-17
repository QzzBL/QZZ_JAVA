package com.qzz.day02.d02_preparedstatement;

import com.qzz.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @ClassName PreparedStatementTest
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/29 10:53
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class PreparedStatementTest {
    public static void main(String[] args) throws Exception {
        //testSaveByStatement();
        testSaveByPrepareStatement();
    }

    //插入数据:XY-21
    public static void testSaveByStatement() throws SQLException {
        String sql = "INSERT INTO t_student (name,age) VALUES('XY',21)";
        //1：加载注册驱动
        //2：获取连接对象
        Connection conn = JdbcUtil.getConn();
        //3：创建语句对象
        Statement st = conn.createStatement();
        //4：执行SQL
        st.executeUpdate(sql);
        //5：释放资源
        JdbcUtil.close(conn, st, null);
    }

    //PrepareStatement
    public static void testSaveByPrepareStatement() throws Exception {
        String sql = "INSERT INTO t_student (name,age) VALUES(?,?)";
        //1：加载注册驱动
        //2：获取连接对象
        Connection conn = JdbcUtil.getConn();
        //3：创建语句对象
        PreparedStatement ps = conn.prepareStatement(sql);
        //设置占位符参数
        ps.setString(1, "赵敏");//没有第0个，都是从1开始
        ps.setInt(2, 18);
        //4：执行SQL
        ps.execute();//里面不能有参数
        //5：释放资源
        JdbcUtil.close(conn, ps, null);
    }
}
