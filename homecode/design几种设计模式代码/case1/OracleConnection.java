package priv.design.case1;

/**
 * @ClassName OracleConnection
 * @Description TODO
 * @Author QZZ
 * @Date 2019/4/27 23:12
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class OracleConnection implements Connection{

    @Override
    public void connecting() {
        System.out.println("oracle 正在连接... ...");
    }
}
