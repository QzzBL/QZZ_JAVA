/**
 * @ClassName TestDemo1
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/31 16:46
 * @Title 愿上苍有好生之德
 **/
    class Base {
    protected int ma;
    public Base (int ma) {
        fun1();
        System.out.println("Base.init()");
        this.ma = ma;
    }
    static {
        System.out.println("Base.static{}");
    }
    {
        System.out.println("Base.instance{}");
    }
    public void fun1() {
        System.out.println("Base.fun1()"+ this.ma);
    }
    public static void fun2() {
        System.out.println("Base.fun2()");
    }
}
class Derieve extends Base {
    private int mb;
    public Derieve(int a,int b) {
        super(a);//必须放在第一行
      /*super.ma = 10;
      super.fun1();*/
        //ma = a;error
        ma = 10;
        this.mb = b;
        System.out.println("Derieve.init{}");
    }
    static {
        System.out.println("Derieve.static{}");
    }
    {
        System.out.println("Derieve.instance{}");
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

public class TestDemo1 {

    public static void main2(String[] args) {
        Base base = new Derieve(1000,9999);
    }

    public static void main3(String[] args) {
        Base base = new Derieve(1000,9999);
        base.fun1();//动多态  运行的时候
        Base.fun2();//静多态  编译的时候
    }

    public static void main1(String[] args) {
        Base base = new Base(100);
        base.fun1();
        System.out.println("==========");
        Derieve derieve = new Derieve(1000,9999);
        derieve.fun1();
    }
    public static void main(String[] args) {
        Base base = new Base(100);

        Derieve derieve = new Derieve(1000,9999);
        base = derieve;//多态的基础
        //derieve = base;error
    }

}

