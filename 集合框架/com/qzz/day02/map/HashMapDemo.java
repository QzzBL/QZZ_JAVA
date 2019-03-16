package com.qzz.day02.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName HashMapDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/19 15:50
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key1", "新的改的");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        map.put("key5", "value5");
        //System.out.println(map);
        //map.clear();
        // System.out.println(map);
        System.out.println(map.containsKey("key1"));
        System.out.println(map.containsValue("value5"));

        Object val = map.get("key2");
        System.out.println(val);

        //map.remove("key5");
        System.out.println(map);

        //map不能用foreach
        //获取Map中所以key所组成的集合key是不能重复的，类似于Set
        Set<String> keys = map.keySet();
        for (String key:keys) {
            System.out.println(key + "-->" + map.get(key));
        }
        //获取Map中所有vlaue组成的集合（value可以重复，类似于List）
        System.out.println("----------------------------------");
        Collection<Object> values = map.values();
        for (Object val1: values) {
            System.out.println(val1);
        }
        System.out.println("----------------------------------");
        //获取Map中所有Entry(key = value)
        Set<Map.Entry<String, Object>> entrys = map.entrySet();
        for (Map.Entry<String, Object> entry: entrys) {
            String key = entry.getKey();//获取key
            Object value = entry.getValue();//获取value
            System.out.println(key + "=" + value);
        }
    }
}
