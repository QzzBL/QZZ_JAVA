   /**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2018-10-24
 * Time: 21:06
 * intern():如果在常量池当中没有字符串的引用，那么就会生成一个在常量池当中的引用
 * 相反：则不生成
 */

/**
 * 作业：
 * 1、将String类里面的方法自己试验
 * 2、"abcdef" ===> "cdefab"   参数：String    n  位置
 * 3、"Here is Tulun" ===> "Tulun is Here"
 */

public class StringDemo2 {

    public static void main(String[] args) {

        char[] array = {'a','b','c','d','e'};
        String str1 = new String(array,2,3);
        System.out.println(str1);

        String str2 = "abcdef";//cde

        String str3 = str2.substring(0,3);//不包含3号下标
        System.out.println(str3);
        //String str3 = "abcdef";
/*
        String str4 = new String("abgdef");

        System.out.println(str2.equals(str4));*/

       //char ch = str2.charAt(7);
      // System.out.println(ch);

       // byte[] chars = new byte[6];
        //str2.getChars(array2,0);
        //str2.getChars(chars,0);??????
        //str2.getChars(0,4,chars,0);
       /* str2.getBytes(0,4,chars,0);
        System.out.println(chars);*/
    }


    public static void main3(String[] args) {
        String str1 = new String("ab")+new String("cdef");
        //str1.intern();
        String str2 = "abcdef";
        str1.intern();
        System.out.println(str1 == str2);
    }

    public static void main2(String[] args) {
        String string = new String("abcdef");
        string.intern();
        String string2 = "abcdef";
        System.out.println(string == string2);
    }

    public static void main1(String[] args) {
        String string = new String("abcdef").intern();
        String string2 = "abcdef";
        System.out.println(string == string2);
    }
}
