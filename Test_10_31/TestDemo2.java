/**
 * @ClassName TestDemo2
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/31 16:48
 * @Title 愿上苍有好生之德
 **/
class Base1{
    protected int h;
    public Base1(int h){
        //fun1();
        System.out.println("Base1.init(构造函数)");
        this.h = h;
    }
    static{
        System.out.println("Base1.static{静态代码块}");
    }
    {
        System.out.println("Base1.instance{实例代码块}");
    }

    public void fun1(){
        System.out.println("Base1.fun1()");
    }
    public static void fun2() {
        System.out.println("Base1.fun2()");
    }
}
class Derieve1 extends Base1{
    private int h1;
    public Derieve1(int a, int b){
        super(a);
        a = 10;
        this.h1 = b;
        System.out.println("Derieve1.init{构造函数}");
    }
    static {
        System.out.println("Derieve.static{静态代码块}");
    }
    {
        System.out.println("Derieve.instance{实例代码块}");
    }

    public void fun1() {
        System.out.println("Derieve.fun1()");
    }
    public void fun1(int a) {
        System.out.println("Derieve.fun1(int)");
    }
    public static void fun2() {
        System.out.println("Derieve.fun2()");
    }


}
public class TestDemo2 {
    public static void main(String[] args) {
        Base1 base1 = new Base1(100);
        base1.fun1();
        System.out.println("==========");
        Derieve1 derieve1 = new Derieve1(1000,9999);
        derieve1.fun1();
    }
    public static void main1(String[] args) {
        Base1 base1 = new Derieve1(1000,9999);
        System.out.println("==============================");
        base1.fun1();//动多态  运行的时候 在运行时，java虚拟机会根据实际创建的对象类型决定使用那个方法。一般将这称为动态绑定。
        System.out.println("==============================");
        Base1.fun2();//静多态  编译的时候
    }
}
