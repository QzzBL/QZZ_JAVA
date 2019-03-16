package com.qzz.day01.day01_01.file;

/**
 * @ClassName FileDemo5
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/21 17:01
 * @Title 愿上苍有好生之德
 * @Description:
 **/

import java.io.File;

/**
 * 批量修改文件名称案例:
 * 在磁盘文件目录中存在多个类似以下的文件:
 * 小码哥教育-Java学院-任小龙老师-01.Java集合框架-Set接口.avi
 * 小码哥教育-Java学院-任小龙老师-02.Java集合框架-List接口.avi
 * 小码哥教育-Java学院-任小龙老师-03.Java集合框架-Map接口.avi
 * 小码哥教育-Java学院-任小龙老师-04.Java集合框架-Iterable接口.avi
 * 截取掉所有视频文件:小码哥教育-Java学院-任小龙老师-.
 */
public class FileDemo5 {
    public static void main(String[] args) {
        File dir = new File("H:\\135");
        //获取当前目录下的所有文件
        File[] fs = dir.listFiles();
        //需要被替换/删除的文字
        String deleteText = "小码哥教育-Java学院-任小龙老师-";
        for (File file : fs) {
            if (file.getName().contains(deleteText)) {
                String newFileName = file.getName().replace(deleteText, "");
                file.renameTo(new File(dir, newFileName));
            }
        }
    }
}
