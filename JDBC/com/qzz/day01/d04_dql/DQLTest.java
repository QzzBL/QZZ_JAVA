package com.qzz.day01.d04_dql;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName DQLTest
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/28 16:08
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//需求1：查询t_student表中有多少条数据
/*
  +-----------+
  | COUNT(id) |
  +-----------+
  |         3 |
  +-----------+
  1 row in set (0.02 sec)
 */
public class DQLTest {
    public static void main(String[] args) throws Exception {
        //testGetCount();
        //testQuerySingle();
        testQueryAll();
    }
    public void testIterator() {
        List<String> list = Arrays.asList("A","B","C","D");
        Iterator<String> it = list.iterator();
        while (( (Iterator) it ).hasNext()) {
            System.out.println();
        }
    }
    public static void testGetCount() throws Exception {
        String sql = "SELECT COUNT(id) FROM t_student";
        //1：加载注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2：获取连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "1998516");
        //3：创建语句对象
        Statement st = conn.createStatement();
        //4：执行SQL
        //====================================
        ResultSet rs = st.executeQuery(sql);
        //处理结果集
        if (rs.next()) {
            //long totalCount = rs.getLong(1);//注意：第一列
            long totalCount = rs.getLong("COUNT(id)");
            //long totalCount = rs.getLong("count");//String sql = "SELECT COUNT(id) count  FROM t_student";(count别名)
            System.out.println(totalCount);
        }
        //====================================
        //5：释放资源
        rs.close();
        st.close();
        conn.close();
    }

    //需求2：查询id为1的学生信息
    /*
+----+----------+-----+
| id | name     | age |
+----+----------+-----+
|  1 | zheshuai |  18 |
+----+----------+-----+
1 row in set
     */
    public static void testQuerySingle() throws Exception {
        String sql = "SELECT * FROM t_student WHERE id = 1";
        //1：加载注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2：获取连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "1998516");
        //3：创建语句对象
        Statement st = conn.createStatement();
        //4：执行SQL
        //====================================
        ResultSet rs = st.executeQuery(sql);
        //处理结果集
        if (rs.next()) {
           long sid = rs.getLong("id");
           String sname = rs.getString("name");
           int sage = rs.getInt("age");
            System.out.println(sid + "," + sname + "," + sage);
        }
        //====================================
        //5：释放资源
        rs.close();
        st.close();
        conn.close();
    }

    //需求3：查询所有学生的信息
    /*
    +----+----------+-----+
| id | name     | age |
+----+----------+-----+
|  1 | zheshuai |  18 |
|  3 | ??       |  32 |
|  4 | ??       |  32 |
+----+----------+-----+
3 rows in set
     */
    public static void testQueryAll() throws Exception {
        String sql = "SELECT * FROM t_student";
        //1：加载注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2：获取连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "1998516");
        //3：创建语句对象
        Statement st = conn.createStatement();
        //4：执行SQL
        //====================================
        ResultSet rs = st.executeQuery(sql);
        //处理结果集
        while (rs.next()) {
            long sid = rs.getLong("id");
            String sname = rs.getString("name");
            int sage = rs.getInt("age");
            System.out.println(sid + "," + sname + "," + sage);
        }
        //====================================
        //5：释放资源
        rs.close();
        st.close();
        conn.close();
    }
}
