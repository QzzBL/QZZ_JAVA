/**
 * @ClassName TestInnerClass3
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/29 20:37
 * @Title 愿上苍有好生之德
 **/

/**
 * 匿名内部类：
 *
 */
class OuterClass3 {
    public void sayHello() {
        System.out.println("hello");
    }
}


public class TestInnerClass3 {

    public static void test(OuterClass3 out3) {
        out3.sayHello();
    }

    public static void main(String[] args) {
        //第一种
        new OuterClass3() {
            public void sayHello() {
                System.out.println("main : hello");
            }
        }.sayHello();

        test(new OuterClass3());
    }
}