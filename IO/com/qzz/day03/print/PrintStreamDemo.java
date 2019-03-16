package com.qzz.day03.print;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @ClassName PrintStreamDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/23 7:53
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//字节打印流
public class PrintStreamDemo {
    public static void main(String[] args) throws Exception {
        PrintStream ps = new PrintStream(new File("H:\\789\\print.txt"));
        ps.write("ABC".getBytes());
        ps.print(true);
        ps.print(17);
        ps.print("will");

        ps.close();
    }
}
