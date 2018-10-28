/**
 * @ClassName SwapString
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/27 23:20
 * @Title 愿上苍有好生之德
 **/
import java.util.Arrays;

import java.util.Scanner;
public class SwapString {
    /**
     - Created with IntelliJ IDEA.
     - Description:
     - User: GAOBO
     - Date: 2018-10-26
     - Time: 11:49
     */
    //"Here is Tulun" ===> "Tulun is Here"
    public static String reverse(char[] ch, int begin, int end) {
        //char[] ch = str.toCharArray();
        char tmp;
        while (begin < end) {
            tmp = ch[begin];
            ch[begin] = ch[end];
            ch[end] = tmp;
            begin++;
            end--;
        }
        return String.copyValueOf(ch);//将ch转化为字符串
    }
    //here is tulun ====> 微信部门
    public static String reverseSentence(String str) {
        if (str == null) {
            return null;
        }
        char[] ch = str.toCharArray();
        //str = reverse(str,0,str.length()-1);//""
        reverse(ch, 0, ch.length - 1);//
        int i = 0;//单词的开始
        int j = 0;//单词的结束
        while (i < str.length()) {
            if (ch[i] == ' ') {//str.chaAt(i)
                i++;
                j++;
            } else if (j == ch.length || ch[j] == ' ') {
                reverse(ch, i, --j);
                i = ++j;
            } else {
                j++;
            }
        }
        return String.copyValueOf(ch);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //char[] chars = new char[10];
        System.out.println( reverseSentence(str));
    }
}
