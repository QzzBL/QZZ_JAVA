/**
 * @ClassName StringReverseExample
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/8 18:51
 * @Title 愿上苍有好生之德
 **/

/**
 * Java 实例 - 字符串反转
 * 以下实例演示了如何使用 Java 的反转函数 reverse() 将字符串反转：
 */
public class StringReverseExample {
    public static void main(String[] args){
        String string="runoob";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("字符串反转前:"+string);
        System.out.println("字符串反转后:"+reverse);
    }
}
