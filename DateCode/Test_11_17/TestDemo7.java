/**
 * @ClassName TestDemo7
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/15 18:48
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class TestDemo7 {
/*    public static String test3() {
        try {
            System.out.println("try block");
            //String tmp = test1();
            return test1();
           // return tmp;
        } finally {
            System.out.println("finally block");
        }
    }
    public static String test1() {
        System.out.println("return statement");
        return "after return";
    }*/


    public static int foo() throws Exception {
        try {
            int a = 5/0;
            return 1;
        }catch(ArithmeticException amExp) {
            throw new Exception("我是Exception异常 ");//ignore
        }finally {
            return 100;
        }
    }
    public static void main(String[] args) {
        //test3();
        int result;
        try {
            result = foo();
            System.out.println(result);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
