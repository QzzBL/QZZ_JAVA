package com.qzz.day02.day02_05.ByteArrayDemo;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * @ClassName StringWriterReaderDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/22 17:04
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class StringWriterReaderDemo {
    public static void main(String[] args) throws IOException {
        //字符串的输出流
        StringWriter sWriter = new StringWriter();
        sWriter.write("我爱你");
        sWriter.write("亲爱的中国");
        System.out.println(sWriter.toString());

        //字符串的输入流
        StringReader sReader = new StringReader(sWriter.toString());
        char[] buffer = new char[1024];
        int len = -1;
        while ((len = sReader.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, len));
        }
    }
}
