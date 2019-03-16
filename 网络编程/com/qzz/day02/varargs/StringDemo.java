package com.qzz.day02.varargs;

/**
 * @ClassName StringDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/25 10:53
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class StringDemo {
    public static void main(String[] args) {
        String ret = StringUtil.join(",","A","B","C","D");
        System.out.println(ret);

        System.out.println(StringUtil.hasLength(null));//false
        System.out.println(StringUtil.hasLength(""));//false
        System.out.println(StringUtil.hasLength("  "));
        System.out.println(StringUtil.hasLength("ABC"));

        System.out.println(String.join("-","A","B","C","D"));
    }
}
