package priv.design.case2;

/**
 * @ClassName ActorController
 * @Description TODO
 * @Author QZZ
 * @Date 2019/4/28 0:01
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class ActorController {
    public Actor construct(ActorBuilder ab) {
        ab.BuildType();
        ab.BuildSex();
        ab.BuildFace();
        ab.BuildCostume();
        ab.BuildHairstyle();
        return ab.createActor();
    }
}
