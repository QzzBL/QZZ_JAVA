import java.util.Arrays;

/**
 * @ClassName TestGenericStack
 * @Description TODO
 * @Author QZZ
 * @Date 2018/12/6 13:00
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
    //是否满
    public boolean isFull() {
        return this.top == this.elem.length;
    }
    //是否空
    public boolean isEmpty() {
        return this.top == 0;
    }
    //扩容2倍
    public void inc() {
        this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
    }
    //压栈
    public void push(T val) {
        if (isFull()) {
            inc();
        }
        this.elem[top++] = val;
    }
    //出栈
    public void pop() {
        if (isEmpty()) {
            return;
        }
        this.elem[top - 1] = null;// 销毁
        --this.top;
    }
    //得到栈顶元素
    public T getTop() {
        return this.elem[this.top - 1];
    }
    //打印
    public void show() {
        for (int i = 0; i < this.top; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }
}
public class TestGenericStack {
    public static void main(String[] args) {
        GenericStack genericStack = new GenericStack();
        genericStack.push(1);
        genericStack.push(2);
        genericStack.push(3);
        genericStack.push(4);
        genericStack.push(5);
        genericStack.push("qzz");

        genericStack.show();

        System.out.println(genericStack.getTop());
    }
}
