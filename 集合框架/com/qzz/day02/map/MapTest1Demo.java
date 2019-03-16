package com.qzz.day02.map;

import java.util.Map;
import java.util.TreeMap;

/**
 * @ClassName MapTest1Demo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/20 10:31
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//需求：计算一个字符串中，每一个字符出现的次数
public class MapTest1Demo {
    public static void main(String[] args) {
        String string = "afdsfjwfouiwofnwnfwj";
        //把字符串转换为char数组（字符串本质就是char[]）
        char[] arr = string.toCharArray();
        //key:存储字符名，value:存储出现次数
        Map<Character, Integer> map = new TreeMap<>();
        //循环得到每一个字符
        for (char ch : arr) {
            //判断当前字符书否在Map中的key存在
            if (map.containsKey(ch)) {
                //当前Map的key包含该字符，此时取出该value值递增，再放进去
                Integer old = map.get(ch);
                map.put(ch, old + 1);
            }else {
                //当前Map的key不包含该字符，把该字符存储到Map中，设置value为1
                map.put(ch, 1);
            }
        }
        System.out.println(map);
    }
}
