/**
 * @ClassName TestInnerClassDemo1
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/29 17:30
 * @Title 愿上苍有好生之德
 **/
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2018-10-28
 * Time: 20:20
 */

/**
 * 内部类：
 * 静态内部类
 * 实例内部类
 * 匿名内部类
 * 本地内部类XXXXXXXX
 */
class OuterClass {
    public int data1 = 1;
    private int data2 = 2;
    private static int data3 = 3;

    public OuterClass() {
        System.out.println("OuterClass() init");
    }

    public void test1() {
        System.out.println("OuterClass().test1()");
    }

    /**
     * 面试问题1：
     * 静态内部类如何访问外部类的非静态数据成员？(静态内部类可以直接访问外部类的静态成员,如果访问外部类的实例成员,必须通过外部类的实例去访问.)
     * 2、静态内部类是否拥有外部类对象？(静态内部类的实例不会自动持有外部类的特定实例的引用,在创建内部类的实例时,不必创建外部类的实例)
     *  Outter.Inner in = new Outter.Inner();
     */
    static class InnerClass {
        public int data4 = 4;
        OuterClass outr;
        public InnerClass(OuterClass outr) {
            this.outr = outr;
            System.out.println("InnerClass()init");
        }
        public void test2() {
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(outr.data2);//如何访问外部类的非静态数据成员
            System.out.println(new OuterClass().data1);// ????
            System.out.println("InnerClass().test2()");
        }
    }

}
public class TestInnerClassDemo1 {
    public static void main(String[] args) {
        //InnerClass innerClass = new InnerClass();(错误)
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass1 = new OuterClass.InnerClass(outerClass);
        System.out.println("-----------------------");
        innerClass1.test2();
    }
}

