/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2018-10-26
 * Time: 20:21
 */

class Base{

    public static int a = 10;//方法区
    public static final int A = 20;//方法区
    public int b = 30;//如果有生成对象==》堆
    public final int C = 40;//

    public static void fun() {
        int a = 10;//栈
        final int b = 20;//栈
    }
}

class TestStaticDemo {
    //int data1 = 10;
    public static int data = 0;//方法区
    public  int sum() {
       data += 1;
        //data1 += 1;
        return data;
    }
}

public class TestDemo {

    public static void main(String[] args) {

        TestStaticDemo testStaticDemo = new TestStaticDemo();
        TestStaticDemo testStaticDemo2 = new TestStaticDemo();

        int data = testStaticDemo.sum();
        System.out.println(data);//1

        int data2 = testStaticDemo2.sum();
        System.out.println(data2);//2
    }
}
