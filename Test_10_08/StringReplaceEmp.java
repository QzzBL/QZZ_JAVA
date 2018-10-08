/**
 * @ClassName StringReplaceEmp
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/8 18:42
 * @Title 愿上苍有好生之德
 **/

/**
 * Java 实例 - 字符串替换
 * 以下实例中我们使用 java String 类的 replace 方法来替换字符串中的字符：
 */
public class StringReplaceEmp {
    public static void main(String[] args){
        String str = "Hello World";
        System.out.println(str.replace('H','W'));
        System.out.println(str.replaceFirst("He", "Wa"));
        System.out.println( str.replaceAll("He", "Ha") );
    }
}
