package com.qzz.day03.print;

/**
 * @ClassName PrintfDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/23 10:20
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//Java的格式化输出
public class PrintfDemo {
    public static void main(String[] args) {
        //打印一句话，效果风格：姓名：will，年龄：17
        String name = "will";
        int age = 17;
        //==========================================
        //传统做法
        String srt = "姓名: " + name + ",年龄: " + age;
        System.out.println(srt);
        //==========================================
        //格式化输出
        String format = "姓名: %s,年龄: %d";//输出格式
        Object[] data = {"will",17};
        System.out.printf(format, data);
        System.out.println();
        //简化
        System.out.printf("姓名: %s,年龄: %d","will",17);
    }
}
