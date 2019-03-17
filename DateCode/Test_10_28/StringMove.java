/**
 * @ClassName StringMove
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/26 12:16
 * @Title 愿上苍有好生之德
 **/
public class StringMove {
    static String str1 = "abcdef";
    static String str2 = "Here is Tulun";
    public static void stringMove(){
        System.out.println(str1.substring(2, 6) + str2.substring(0, 2));
        System.out.println(str2.substring(8, 13) + str2.substring(4, 8) + str2.substring(0, 4)   );
    }
    public static void main(String[] args) {
        stringMove();
    }
}
