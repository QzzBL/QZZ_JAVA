import java.util.Arrays;

/**
 * @ClassName SqStackDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2018/12/5 23:56
 * @Title 愿上苍有好生之德
 * @Description: 顺序栈 （栈的存储结构主要分两种：栈的顺序存储结构和链接存储结构。）
 **/
class SqStack {
    private int top;
    private int[] elem;
    //private int usedSize;

    public SqStack() {
        this(10);
    }
    public SqStack(int size) {
        this.top = 0;
        this.elem = new int[size];
    }

    //1.是否满
    public boolean isFull() {
        return this.top == this.elem.length;
    }
    //2.是否空
    public boolean isEmpty() {
        return this.top == 0;
    }
    //3.扩容2倍
    public void inc() {
        this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
    }
    //4.入栈
    public void push(int val) {
        if (isFull()) {
            inc();
        }
        //System.out.println("first_ top++ " + this.top);
        this.elem[this.top++] = val;
        //System.out.println("last top++ " + this.top);
        //this.usedSize++;
    }
    //5.出栈
    public void pop() {
        if (isEmpty()) {
            return;
        }
        //System.out.println("first--this.top " + --this.top);这样写是有问题
        --this.top;
        //System.out.println("last--this.top " + --this.top); 这样写是有问题
        //--this.usedSize;
    }
    //6.得到栈顶元素
    public int getTop() {
        if (isEmpty()) {
            return -1;
        }
        return this.elem[this.top - 1];
    }
    //7.打印
    public void show() {
        for (int i = 0; i < this.top; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
        //System.out.println(this.usedSize);
    }
}
public class SqStackDemo {
    public static void main(String[] args) {
        SqStack sqStack = new SqStack();
        for (int i = 1; i <= 20; i++) {
            sqStack.push(i);
        }
        sqStack.show();
        sqStack.pop();
        //sqStack.pop();
        sqStack.show();
        System.out.println(sqStack.getTop());
    }
}
