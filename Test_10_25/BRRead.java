/**
 * @ClassName BRRead
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/7 18:56
 * @Title 愿上苍有好生之德
 **/


/**
 * 从控制台读取多字符输入
 * 从 BufferedReader 对象读取一个字符要使用 read() 方法，它的语法如下：
 * int read( ) throws IOException
 * 每次调用 read() 方法，它从输入流读取一个字符并把该字符作为整数值返回。 当流结束的时候返回 -1。该方法抛出 IOException。
 * 下面的程序示范了用 read() 方法从控制台不断读取字符直到用户输入 "q"。
 */

import java.io.*;

public class BRRead {
    public static void main(String args[]) throws IOException {
        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
