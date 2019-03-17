/**
 * @ClassName BRReadLines
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/7 19:03
 * @Title 愿上苍有好生之德
 **/

/**
 * 从控制台读取字符串
 * 从标准输入读取一个字符串需要使用 BufferedReader 的 readLine() 方法。
 * 它的一般格式是：
 * String readLine( ) throws IOException
 * 下面的程序读取和显示字符行直到你输入了单词"end"。
 */
import java.io.*;

public class BRReadLines {
    public static void main(String args[]) throws IOException {
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }
}

//JDK 5 后的版本我们也可以使用 Java Scanner 类来获取控制台的输入。
/*import java.util.*;
public class BRReadLines {
    public static void main(String args[]) throws IOException {
        // 使用 System.in 创建 BufferedReader
        Scanner br = new Scanner(System.in);
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.nextLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }
}*/
