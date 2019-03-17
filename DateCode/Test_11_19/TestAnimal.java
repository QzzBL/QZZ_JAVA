/**
 * @ClassName TestAnimal
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/19 16:54
 * @Title 愿上苍有好生之德
 * @Description:
 **/
class GenericStack1<T> {
    private T[] elem;
    private int top;

    public GenericStack1() {
        this(10);
    }
    public GenericStack1(int size) {
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
}

class Animal1 {

}
public class TestAnimal {
    public static void main(String[] args) throws InterruptedException {
        GenericStack genericStack = new GenericStack();
        genericStack.push(new Animal());
        genericStack.push(new Animal());
        genericStack.push(new Animal());
        genericStack.pop();
        System.gc();
        Thread.sleep(100000);
    }
}
