package priv.design.case2;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @ClassName ActorBuilder
 * @Description TODO
 * @Author QZZ
 * @Date 2019/4/28 0:02
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public abstract void BuildType();
    public abstract void BuildSex();
    public abstract void BuildFace();
    public abstract void BuildCostume();
    public abstract void BuildHairstyle();
    public Actor createActor() {
        return actor;
    }
}
