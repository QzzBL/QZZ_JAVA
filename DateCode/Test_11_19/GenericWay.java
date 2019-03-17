/**
 * @ClassName GenericWay
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/19 19:56
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class GenericWay {
    /*
     fun1没有void时，Invalid method declaration return type required
     方法声明返回类型无效
     */
    public<T> void fun1(T obj1) { //没有void时，
        System.out.println(obj1);
    }
    public <T> T fun2(T obj) {
        return obj;
    }
    public static void main(String[] args) {
        GenericWay genericWay = new GenericWay();
        genericWay.fun1("sortware engneering");
        genericWay.fun1(18);

        System.out.println(genericWay.fun2("qzz"));
        System.out.println(genericWay.fun2(18));
    }
}
