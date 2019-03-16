package com.qzz.day03.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @ClassName FileCopy
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/23 17:38
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class FileCopy {
    public static void main(String[] args) throws Exception {
        //Files.copy(Paths.get("H:\\789\\nioCopyed.txt"), new FileOutputStream("H:\\789\\nioCopy.txt"));
        Files.copy(new FileInputStream("H:\\789\\nioCopy1.txt"), Paths.get("H:\\789\\nioCopy2.txt"));
    }
}
