package com.qzz.day02.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @ClassName TreeMapDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/19 15:40
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, Object> map = new TreeMap<>();
        //Map<String, Object> map = new LinkedHashMap<>();
        //Map<String, Object> map = new HashMap<>();
        map.put("C", "CVlue");
        map.put("A", "AVlue");
        map.put("Z", "ZVlue");
        map.put("d", "dVlue");
        map.put("a", "aVlue");
        map.put("2", "2Vlue");
        map.put("1", "1Vlue");

        System.out.println(map);
    }
}
