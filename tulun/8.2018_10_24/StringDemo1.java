/**
 * Created with IntelliJ IDEA.
 * Description:    String
 * User: GAOBO
 * Date: 2018-10-24
 * Time: 19:23
 */

/**
 * String 类是一个不可变类，你不能试图去修改原来的值
 * "abcde"   "abcdef"
 * 被优化为StringBuilder，但是循环的时候，一定要注意
 *
 * StringBuffer:        synchronized线程安全  多线程
 * StringBuilder:      单线程
 */
class String1 {
    public void fun1(String[] str1) {
        String str2 = "";
        for(int i = 0; i < str1.length;i++) {
           // str2 = str2+str1[i];
            StringBuilder stringBuilder = new StringBuilder(str2);
            stringBuilder.append(str1[i]);
            str2 = stringBuilder.toString();
        }
    }
}

class String2 {
    public String fun2(String[] str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            stringBuilder.append(str[i]);
        }
        return stringBuilder.toString();
    }
}

public class StringDemo {

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "hello";
        String str3 = str1+str2+"world";
        System.out.println(str3);
    }

    public static void main4(String[] args) {
        String str1 = "abcde";
        String str2 = "abcde";
        System.out.println(Integer.toHexString(str1.hashCode()));
        str1 = str1+"fg";
        System.out.println(Integer.toHexString(str1.hashCode()));
        System.out.println("===========================");


        StringBuffer stringBuffer = new StringBuffer("hello");
        System.out.println(stringBuffer);
        System.out.println(Integer.toHexString(stringBuffer.hashCode()));
        stringBuffer.append("world");//追加
        System.out.println(stringBuffer);
        System.out.println(Integer.toHexString(stringBuffer.hashCode()));
        System.out.println("=============stringBuilder==============");
        StringBuilder stringBuilder = new StringBuilder("tulun");//"tulunworld"
        System.out.println(stringBuilder);
        System.out.println(Integer.toHexString(stringBuilder.hashCode()));
        stringBuilder.append("world");//追加
        System.out.println(stringBuilder);
        System.out.println(Integer.toHexString(stringBuilder.hashCode()));

    }


    public static void main3(String[] args) {
        String str1 = new String("hello");
        String str2 = "hello";
        System.out.println(str1 == str2);//false

        String str3 = "he"+new String("llo");
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);

        String str4 = "he"+"llo";
        System.out.println(str4 == str2);

        char[] array = {'h','e','l','l','o'};
        String str5 = new String(array);
        System.out.println("=============");
        System.out.println(str1 == str5);
        System.out.println(str2 == str5);
        System.out.println(str3 == str5);
        System.out.println(str4 == str5);
    }

    public static void main2(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String str3 = "helloworld";

        System.out.println(str1+str2);
        System.out.println(str3);

        System.out.println(str3 == (str1+str2));
        System.out.println(str3 == ("hello"+"world"));
    }

    public static void main1(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "he"+"llo";//"hello"
        String str4 = new String("he")+new String("llo");
        System.out.println(str1 == str2);//
        System.out.println(str3 == str1);//
        System.out.println(str3 == str2);//
        System.out.println(str4 == str3);//
    }
}
