package priv.design.case1;

/**
 * @ClassName MySQLConnection
 * @Description TODO
 * @Author QZZ
 * @Date 2019/4/27 23:13
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class MySQLConnection implements Connection{
    @Override
    public void connecting() {
        System.out.println("MySQL 正在连接... ...");
    }
}
