package priv.design.case1;

/**
 * @ClassName MySQLFactory
 * @Description TODO
 * @Author QZZ
 * @Date 2019/4/27 23:18
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class MySQLFactory implements DBFactory{
    @Override
    public Connection createConnect() {
        return new MySQLConnection();
    }
    @Override
    public Statement createStatement() {
        return new MySQLStatement();
    }
}
