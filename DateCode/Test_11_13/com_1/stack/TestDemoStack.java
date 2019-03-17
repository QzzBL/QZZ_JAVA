package com_1.stack;

/**
 * @ClassName TestDemoStack
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/11 11:34
 * @Title 愿上苍有好生之德
 **/
class Stack {

    private int top;//栈顶指针

    private int[] elem;

    private int usedSize;

    /*public Stack() {
        this.top = 0;
        this.elem = new int[10];
    }*/

    public Stack() {
        this.elem = new int[10];
    }
    //行为==》方法
    public boolean isFull() {
        if(this.top == this.elem.length) {
            return true;
        }
        return false;
    }

    public void push(int val) {
        if(isFull()) {
            return;
        }
        this.elem[top++] = val;
        this.usedSize++;
    }

    public boolean isEmpty() {
        return this.top == 0;
    }

    public void pop() {
        if(isEmpty()) {
            return;
        }
        this.top--;
        this.usedSize--;
    }

    public void show() {
        for (int i = 0; i < this.top; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println(this.usedSize);
        //System.out.println(Arrays.toString(this.elem));
    }

}

public class TestDemoStack {

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(10);

        stack.push(20);

        stack.push(30);

        stack.show();

        stack.pop();

        stack.show();

    }

}

