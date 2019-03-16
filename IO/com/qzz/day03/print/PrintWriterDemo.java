package com.qzz.day03.print;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * @ClassName PrintWriterDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/23 7:56
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//字符打印流
public class PrintWriterDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter ps = new PrintWriter(new FileOutputStream(new File("H:\\789\\print.txt")), true);
        ps.write("ABC");
        ps.print(true);
        ps.print(17);
        ps.print("will");
        ps.println();
        //ps.flush();

        ps.close();
    }
}
