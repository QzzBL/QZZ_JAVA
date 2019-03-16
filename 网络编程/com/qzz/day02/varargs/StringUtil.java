package com.qzz.day02.varargs;

/**
 * @ClassName StringUtil
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/25 10:43
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class StringUtil {
    private StringUtil() {
    }//构造方法私有化，不能创造工具类的对象
    //判断字符串费控
    //1):引用为空，null
    //2):空字符串，""
    public static boolean hasLength(String str) {
        if (str != null && !"".equals(str.trim())) {//str.trim() 字符串中有空格的去掉
            return true;
        }
        return false;
    }

    //判断字符串为空
    public static boolean isBlank(String str) {
        return !hasLength(str);
    }
    public static boolean hasLength2(String str) {
        return str != null && !"".equals(str.trim());
    }

    //定义一个方法：join，可以对传入该方法的字符串按照指定的分隔符做链接，并返回连接好的新的字符串
    public static String join(String separator, String... values){
        if (isBlank(separator)) {
            separator = ",";
        }
        StringBuilder stringBuilder = new StringBuilder(values.length * 2 - 1);
        for (int i = 0; i < values.length; i++) {
            stringBuilder.append(values[i]);
            if (i != values.length - 1) {
                stringBuilder.append(separator);
            }
        }
        return stringBuilder.toString();
    }
}
