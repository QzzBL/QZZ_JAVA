import java.util.Arrays;

/**
 * @ClassName TestGenericStack
 * @Description TODO
 * @Author QZZ
 * @Date 2018/12/6 13:00
 * @Title Ը�ϲ��к���֮��
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
    //�Ƿ���
    public boolean isFull() {
        return this.top == this.elem.length;
    }
    //�Ƿ��
    public boolean isEmpty() {
        return this.top == 0;
    }
    //����2��
    public void inc() {
        this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
    }
    //ѹջ
    public void push(T val) {
        if (isFull()) {
            inc();
        }
        this.elem[top++] = val;
    }
    //��ջ
    public void pop() {
        if (isEmpty()) {
            return;
        }
        this.elem[top - 1] = null;// ����
        --this.top;
    }
    //�õ�ջ��Ԫ��
    public T getTop() {
        return this.elem[this.top - 1];
    }
    //��ӡ
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
