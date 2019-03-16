package com.qzz.day01.day01_01.file;

import java.io.File;

/**
 * @ClassName FileDemo3
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/21 16:05
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//需求：列出指定目录中所有的文件，包括子文件夹中的所有文件（使用递归算法（recursion））
//注意：递归一定得有出口
public class FileDemo3 {
    public static void main(String[] args) {
        File dir = new File("D:\\workspace\\Qzz_Java");
        listAllFile(dir);
    }

    //列出所有的文件
    private static void listAllFile(File f) {
        //第一级子文件
        File[] fs = f.listFiles();
        for (File file : fs) {
            //打印目录和文件
            System.out.println(file);

            //如果子文件是目录，则继续递归
            if (file.isDirectory()) {
                listAllFile(file);
            }
        }
    }
}
