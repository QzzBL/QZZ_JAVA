package com.qzz.day02.varargs;

/**
 * @ClassName VarArgsDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/25 9:16
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//可变参数
public class VarArgsDemo {
    public static void main(String[] args) {
        CartItem item1 = new CartItem("手机", 1000, 10);
        CartItem item2 = new CartItem("平板", 2000, 20);
        CartItem item3 = new CartItem("笔记本电脑", 3000, 30);

        /*CartItem[] items = {item1, item2, item3};
        Double ret = getTotalPrice(items);*/

        Double ret = getTotalPrice(0.8, item1, item2, item3);
        System.out.println(ret);
    }

    //可变参数就是数组
    public static Double getTotalPrice(Double discount, CartItem... items) {
        Double ret = 0.0;
        for (int i = 0; i < items.length; i++) {
            ret += items[i].getNum() * items[i].getPrice();
        }
        return ret * discount;
    }


    //提供一个方法，用于求出多个商品的总价格
    /*public static Double getTotalPrice(CartItem[] items) {
        Double ret = 0.0;
        for (int i = 0; i < items.length; i++) {
            ret += items[i].getNum() * items[i].getPrice();
        }
        return ret;
    }*/
}
