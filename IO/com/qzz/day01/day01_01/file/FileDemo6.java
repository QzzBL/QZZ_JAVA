package com.qzz.day01.day01_01.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @ClassName FileDemo6
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/21 17:20
 * @Title 愿上苍有好生之德
 * @Description:
 **/
// 文件过滤器
public class FileDemo6 {
    public static void main(String[] args) {
        File dir = new File("H:\\135");
        File[] fs = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isFile() && name.endsWith(".txt");
            }
        });
        for (File file : fs) {
            System.out.println(file);
        }
    }
}
