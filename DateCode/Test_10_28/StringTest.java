/**
 * @ClassName StringTest
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/25 23:38
 * @Title 愿上苍有好生之德
 **/
public class StringTest {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "he" + "llo";
        String str4 = new String("he") + new String("llo");
        System.out.println(str1 == str2);//
        System.out.println(str3 == str1);//
        System.out.println(str3 == str2);//
        System.out.println(str4 == str3);//
    }
}
