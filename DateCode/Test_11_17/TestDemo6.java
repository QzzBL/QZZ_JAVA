/**
 * @ClassName TestDemo6
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/15 18:25
 * @Title 愿上苍有好生之德
 * @Description: 异常简单的习题
 **/

/**
 *   练习1: (2) 编写一个类，在其main0方法的try块里抛出一个Exception类的对象。
 *   传递-一个字符串参数给Exception的构造器。在catch子句里捕获此异常对象，
 *   并且打印字符串参数。添加一个finally子句，打印一条信息以证明这里确实得到了执行。
 *
 *   练习2: (1)定义一个对象引用并初始化为null,尝试用此引用调用方法。
 *   把这个调用放在try-catch子句里以捕获异常。
 *
 *   练习3: (1) 编写能产生并能捕获ArrayIndexOutOfBoundsException异常的代码。
 *
 *   练习4: (2)使用extends关键宇建立-个自定义异常类。为这个类写一个接受字符串参数的构造器，
 *   把此参数保存在对象内部的字符串引用中。写一个方法显示此字符串。写- -个try-catch子句，
 *   对这个新异常进行测试。
 */
public class TestDemo6 {
    public static void main(String[] args) {
        //练习1
        try {
            throw new Exception("Exception");
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("It is ending");
        }

        //练习2
        String str = null;
        try {
            int len = str.length();
        }catch (NullPointerException e) {
            e.printStackTrace();
        }

        //练习3
        try {
            int[] array = {1, 2, 3, 4};
            System.out.println(array[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界");
            e.printStackTrace();
        }
    }
}
