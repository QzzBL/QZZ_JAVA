public class HelloJava {
    static int i = 1; //属性名是i
    public void method1(int i) { //参数也是i
        System.out.println(i);         // 5
        System.out.println(this.i);    // 1
        //这就是this关键字的作用，this,i意思是指向的类的属性，也就是int i=1那句话所定义的i的值，
        // 如果不加this,只写一个i，那么这个i指向的就是你那个method1()方法里输入的i的值。
    }



    public static void main(String[] args) {
        new HelloJava().method1(5);
        //结果打印出来是 1还是5?
    }
}