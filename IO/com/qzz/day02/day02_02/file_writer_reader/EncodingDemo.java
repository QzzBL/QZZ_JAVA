package com.qzz.day02.day02_02.file_writer_reader;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @ClassName EncodingDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/22 11:22
 * @Title 愿上苍有好生之德
 * @Description: 编码和解码
 **/
//编码和解码
public class EncodingDemo {
    public static void main(String[] args) throws Exception {
        String msg = "老哥";
        //编码操作：String->byte[]
        byte[] data = msg.getBytes("UTF-8");
        System.out.println(Arrays.toString(data));// [-64, -49, -72, -25]

        //解码操作：byte[]->String
        //因为服务都是老外写的，所以老外解码使用自己的ISO-8859-1
        String ret = new String(data, "ISO-8859-1");// 乱码
        System.out.println(ret);
        //对于中文来说,乱码
        //解决方案：
        data = ret.getBytes("ISO-8859-1");
        System.out.println(Arrays.toString(data));// [-64, -49, -72, -25]
        ret = new String(data, "UTF-8");
        System.out.println(ret);


        /**
         * 乱码原因：编码和解码用的不是同一种字符集
         */
    }
}
