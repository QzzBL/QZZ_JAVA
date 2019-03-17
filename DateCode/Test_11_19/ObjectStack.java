/**
 * @ClassName ObjectStack
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/18 22:02
 * @Title 愿上苍有好生之德
 * @Description:
 **/
class Stack {
    private Object elem[];
    private int top;

    public Stack(){
        this(10);
    }
    public Stack(int size){
        this.elem = new Object[size];
        this.top = 0;
    }
    //压栈
    public void push(Object val) {
        this.elem[this.top++] = val;
    }
    //出栈
    public void pop() {
        --this.top;
    }
    //得到栈顶元素
    public Object getTop() {
        return this.elem[this.top - 1];
    }

    public void show() {
        for (int i = 0; i < elem.length; i++) {
            System.out.println(this.elem[i] + " ");
        }
    }
}
public class ObjectStack {
    public static void main(String[] args) {
        Stack objectStack = new Stack();
        objectStack.push(10);
        objectStack.push(20);
        objectStack.push(30);
        objectStack.push("ddd");
        //objectStack.show();


        //String str = (String)objectStack.getTop();
        //System.out.println(str);
    }
}
