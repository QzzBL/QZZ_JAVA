package com.qzz.day02.varargs;

/**
 * @ClassName CartItem
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/25 9:13
 * @Title 愿上苍有好生之德
 * @Description:
 **/
//商品选项
public class CartItem {
    private String name;//商品名称
    private Integer price;//商品价格
    private Integer num;//购买数量

    public CartItem() {
    }

    public CartItem(String name, Integer price, Integer num) {
        this.name = name;
        this.price = price;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", num=" + num +
                '}';
    }
}
