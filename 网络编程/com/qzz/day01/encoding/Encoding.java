package com.qzz.day01.encoding;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @ClassName Encoding
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/24 11:18
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class Encoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //获取平台的默认字符集

        System.out.println(System.getProperties());
        String name = "任小龙 will 17";
        //%E4%BB%BB%E5%B0%8F%E9%BE%99+will+17
        //String ret = URLEncoder.encode(name); 过时
        //使用UTF-8编码
        String ret = URLEncoder.encode(name,"UTF-8");
        System.out.println(ret);
        //使用UTF-8解码
        String msg = URLDecoder.decode(ret,"UTF-8");
        System.out.println(msg);
    }
}
