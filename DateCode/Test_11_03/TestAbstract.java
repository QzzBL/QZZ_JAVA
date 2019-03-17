/**
 * @ClassName TestAbstract
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/4 11:20
 * @Title 愿上苍有好生之德
 **/
//形状类：
abstract class Shape {

    //抽象方法
    public abstract double area();
    public abstract double perimeter();

    //普通方法
    public void fun() {
        System.out.println("ending");
    }

}
//矩形类：
class Rectangle extends Shape {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @java.lang.Override
    public double area() {
        return getLength() * getWidth();
    }

    @java.lang.Override
    public double perimeter() {
        return  2 * (getLength() + getWidth());
    }
}

//圆形类：
class Circle extends Shape {
    private double diameter;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @java.lang.Override
    public double area() {
        return Math.PI * Math.pow(getDiameter() / 2, 2);
    }

    @java.lang.Override
    public double perimeter() {
        return Math.PI * getDiameter();
    }
}

public class TestAbstract {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.setLength(10);
        rec.setWidth(5);
        double rec_area = rec.area();
        double rec_perimeter = rec.perimeter();
        System.out.println("矩形的面积："+rec_area+"，周长"+rec_perimeter);

        rec.fun();
    }
}
