import java.util.Arrays;

/**
 * @ClassName SqStackDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2018/12/5 23:56
 * @Title Ը�ϲ��к���֮��
 * @Description: ˳��ջ ��ջ�Ĵ洢�ṹ��Ҫ�����֣�ջ��˳��洢�ṹ�����Ӵ洢�ṹ����
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

    //1.�Ƿ���
    public boolean isFull() {
        return this.top == this.elem.length;
    }
    //2.�Ƿ��
    public boolean isEmpty() {
        return this.top == 0;
    }
    //3.����2��
    public void inc() {
        this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
    }
    //4.��ջ
    public void push(int val) {
        if (isFull()) {
            inc();
        }
        //System.out.println("first_ top++ " + this.top);
        this.elem[this.top++] = val;
        //System.out.println("last top++ " + this.top);
        //this.usedSize++;
    }
    //5.��ջ
    public void pop() {
        if (isEmpty()) {
            return;
        }
        //System.out.println("first--this.top " + --this.top);����д��������
        --this.top;
        //System.out.println("last--this.top " + --this.top); ����д��������
        //--this.usedSize;
    }
    //6.�õ�ջ��Ԫ��
    public int getTop() {
        if (isEmpty()) {
            return -1;
        }
        return this.elem[this.top - 1];
    }
    //7.��ӡ
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
