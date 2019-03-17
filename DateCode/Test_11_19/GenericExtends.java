/**
 * @ClassName GenericExtends
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/19 20:21
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//泛型定义在接口上
//子类明确泛型类的类型参数变量
interface Inter<T> {
    public abstract void show(T obj);
}
class InterImpl implements Inter<String> {
    @Override
    public void show(String obj) {
        System.out.println(obj);
    }
}
class InterImpl1<T> implements Inter<T>{
    @Override
    public void show(T obj) {
        System.out.println(obj);
    }
}

    public class GenericExtends {

    public static void main(String[] args) {
        //Inter<Double> inter = new InterImpl();//incompatible types 矛盾的类型
        Inter<String> inter = new InterImpl();
        inter.show("qzz");

        Inter<Double> inter1 = new InterImpl1();
        inter1.show(1.1);
    }
}
