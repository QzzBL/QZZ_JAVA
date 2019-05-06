package priv.design.case1;

/**
 * @ClassName Client
 * @Description TODO
 * @Author QZZ
 * @Date 2019/4/27 23:43
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class Client {
    public static void main(String[] args) {
        try {
            DBFactory factory;
            Connection cn;
            Statement st;
            factory = (DBFactory)XMLUtil.getBean();
            cn = factory.createConnect();
            cn.connecting();
            st = factory.createStatement();
            st.UserStatement();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
