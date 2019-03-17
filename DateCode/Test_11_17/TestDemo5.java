/**
 * @ClassName TestDemo5
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/15 15:47
 * @Title 愿上苍有好生之德
 **/
class SimpleException extends Exception {//自定义类，继承Exception
    public SimpleException() {

    }
}
public class TestDemo5 {
    public static void fun1() throws SimpleException {
        System.out.println("throw SimpleException");
        throw new SimpleException();// 可以给参数//抛出异常，被catch捕获
    }
    public static void main(String[] args) {
        TestDemo5 test = new TestDemo5();
        try {
            test.fun1();
        }catch (SimpleException e) {
            System.out.println("SimpleException 异常被捕捉");
            e.printStackTrace();
        }
    }

}
