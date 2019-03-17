/**
 * @ClassName GenericObjectStack
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/18 22:52
 * @Title 愿上苍有好生之德
 * @Description:
 **/
class GenericStack<T> {
    private T[] elem;
    private int top;

    public GenericStack() {
        this(10);
    }
    public GenericStack(int size) {
        this.elem = (T[])new Object[size];
        this.top = 0;
    }
    //压栈
    public void push(T val) {
        this.elem[top++] = val;
    }
    //出栈
    public void pop() {
        this.elem[top - 1] = null;
        --this.top;
    }
    //得到栈顶元素
    public T getTop() {
        return this.elem[this.top - 1];
    }
    public void show() {
        for (int i = 0; i < elem.length; i++) {
            System.out.println(this.elem[i] + " ");
        }
    }
}


class Animal {

}
public class GenericObjectStack {
    public static void main(String[] args) throws InterruptedException {
        /*GenericStack<Integer> genericStack = new GenericStack<Integer>();
        GenericStack<String> genericStack1 = new GenericStack<String>();

        System.out.println(genericStack);
        System.out.println(genericStack1);*/

        GenericStack<Integer> genericStack = new GenericStack<Integer>();
        genericStack.push(10);
        genericStack.push(20);
        int data = genericStack.getTop();//不需要强制转化，对于的类型拆箱后是 int

        GenericStack<Double> genericStack1 = new GenericStack<Double>();
        genericStack1.push(9.9);
        genericStack1.push(99.9);
        double data2 = genericStack.getTop();
        genericStack1.show();

        System.out.println("===================================================\n");

        GenericStack<Integer> genericStack3 = new GenericStack<Integer>();
        GenericStack<String> genericStack4 = new GenericStack<String>();
        //GenericStack@16d3586   GenericStack<Integer>
        //GenericStack@154617c  GenericStack<String>
        System.out.println(genericStack3);
        System.out.println(genericStack4);

        System.out.println(int.class);
        System.out.println(String.class);
        System.out.println(GenericStack.class);
        //GenericStack<Integer>[] genericStacks = new GenericStack<Integer>[10];


        System.out.println("===================================================\n");

        GenericStack<Animal> genericStack5 = new GenericStack<Animal>();
        GenericStack genericStack6 = new GenericStack();
        genericStack6.push(50);
        genericStack6.push(10.99);
        genericStack6.push("fsaljl");


        genericStack5.push(new Animal());
        genericStack5.push(new Animal());
        genericStack5.push(new Animal());
        genericStack.pop();
        System.gc();
        Thread.sleep(100000);
        // System.out.println(genericStack5.getTop());

    }
}
