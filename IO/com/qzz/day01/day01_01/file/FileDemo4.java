package com.qzz.day01.day01_01.file;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName FileDemo4
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/21 16:11
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//File类案列-列出文件的分层结构
public class FileDemo4 {
    public static void main(String[] args) {
        //期望效果 workspace>Qzz_Java>tulun>2.2018_10_10
        String file = "D:\\workspace\\Qzz_Java\\tulun\\2.2018_10_10\\运算符优先级.pdf";
        File f = new File(file);

        /*//父级目录：2.2018_10_10
        //System.out.println(f.getParentFile());
        System.out.println(f.getParentFile().getName());
        //父级目录：tulun
        System.out.println(f.getParentFile().getParentFile().getName());
        //父级目录：Qzz_Java
        System.out.println(f.getParentFile().getParentFile().getParentFile().getName());*/

        List<String> parentNames = new ArrayList<>();
        /*parentNames.add("2.2018_10_10");
        parentNames.add("tulun");
        parentNames.add("Qzz_Java");*/

        listAllParent(parentNames, f);

        System.out.println(parentNames);
        Collections.reverse(parentNames);//点到List元素顺序
        //System.out.println(parentNames);
        StringBuilder sb = new StringBuilder(50);
        for (String name : parentNames) {
            sb.append(name).append(">");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }

    private static void listAllParent(List<String> parentNames, File f) {
        if (!"".equals(f.getParentFile().getName())) {
            parentNames.add(f.getParentFile().getName());
        }// 这个if和输出结果之前的顿号没理解

        if (f.getParentFile().getParentFile() != null) {
            listAllParent(parentNames, f.getParentFile());
        }
    }
}
