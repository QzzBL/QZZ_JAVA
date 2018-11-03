/**
 * @ClassName TestInnerClassDemo2
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/29 17:52
 * @Title 愿上苍有好生之德
 **/
class OuterClass1{
    String name = "Outer.name";
    public int data1;
    private int data2;
    private static int data3;

    {
        data1 = 999;
        data2 = 888;
        data3 = 777;
    }



    public void ooxx(){
        System.out.println(this.new InnerClass().age);
    }
    //实例内部类
    class InnerClass{
        int age = 17;
        String name = "Inner.name";

        private int data3 = 100;
        public int data5 = 10;
        //private static  int DATA4 = 1000;error
        private static final int DATA4 = 1000;
        //private static final int DATA4 = data5;error


        public void test(){
            String name = "local.name";
            System.out.println(name);//访问内部类方法中的的name//如果方法中没有，访问的是内部类的name
            System.out.println(this.name);//访问内部类的name
            System.out.println(OuterClass1.this.name);//访问外部类的name
        }

        public void test2(){
            System.out.println(data1);//999
            System.out.println(data2);//888    OuterClass2.this.
            System.out.println(this.data3);//100
            System.out.println(OuterClass1.this.data3);//777
            System.out.println("InnerClass2().test2()");
        }
    }
}
public class TestInnerClassDemo2 {
    public static void main(String[] args) {
        OuterClass1 outerClass = new OuterClass1();
        //外部类名.内部类名    引用名 =  外部类对象.new 内部类();
        OuterClass1.InnerClass innerClass1 = outerClass.new InnerClass();
        innerClass1.test();
        System.out.println("-------------------");
        innerClass1.test2();
    }
}
