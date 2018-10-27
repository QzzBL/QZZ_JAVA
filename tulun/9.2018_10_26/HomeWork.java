/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2018-10-26
 * Time: 11:49
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1、abcdef
 */

public class HomeWork {

    public static String reverse1(String str,int begin,int end) {
        char[] ch = str.toCharArray();
        char tmp;
        while(begin < end) {
            tmp = ch[begin];
            ch[begin] = ch[end];
            ch[end] = tmp;
            begin++;
            end--;
        }
        return String.copyValueOf(ch);//将ch转化为字符串
    }
    public static void reverse(char[] ch,int begin,int end) {
        //char[] ch = str.toCharArray();
        char tmp;
        while(begin < end) {
            tmp = ch[begin];
            ch[begin] = ch[end];
            ch[end] = tmp;
            begin++;
            end--;
        }
        //return String.copyValueOf(ch);//将ch转化为字符串
    }
    //here is tulun ====> 微信部门
    public static String reverseSentence(String str) {
        if(str == null) {
            return null;
        }
        char[] ch = str.toCharArray();
        //str = reverse(str,0,str.length()-1);//""
        reverse(ch,0,ch.length-1);//
        int i = 0;//单词的开始
        int j = 0;//单词的结束
        while(i < str.length()) {
            if(ch[i] == ' ') {//str.chaAt(i)
                i++;
                j++;
            } else if(j == ch.length || ch[j] == ' ') {
                reverse(ch,i,--j);
                i = ++j;
            } else {
                j++;
            }
        }
       return String.copyValueOf(ch);
    }

    public static void leftRoadString(String str,int n) {//2
        if(str == null || n < 0 || n > str.length()) {
            return;
        }
        //abcdef
        int left = 0;
        int leftend = n-1;
        int right = n;
        int rightend = str.length()-1;
        str = reverse1(str,left,leftend);//bacdef
        str = reverse1(str,right,rightend);//bafedc
        str = reverse1(str,left,rightend);//cdefab
        System.out.println(str);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(reverseSentence(str));
       /* int n = scanner.nextInt();
        leftRoadString(str,n);*/
        /*String string = "abcdef";
        char[] chars = new char[10];
        //string.getChars(chars,0);
        string.getChars(0,4,chars,0);*/
    }
}
