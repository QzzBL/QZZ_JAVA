package priv.design.case2;

import priv.design.case1.XMLUtil;

/**
 * @ClassName Client
 * @Description TODO
 * @Author QZZ
 * @Date 2019/4/28 0:12
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class Client {
    public static void main(String[] args) {
        ActorBuilder ac = (ActorBuilder)XMLUtil2.getBean();
        ActorController player = new ActorController();
        System.out.println("运行结果如下: ");
        System.out.println();
        Actor actor = player.construct(ac);
    }
}
