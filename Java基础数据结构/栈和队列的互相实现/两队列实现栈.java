package mycalss.qzz.tulun18_12_09;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @ClassName TwoQueueToOneStackDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2018/12/9 12:54
 * @Title Ը�ϲ��к���֮��
 * @Description: ������ʵ��ջ
 **/
class TwoQueueToOneStack {
    class Node {
        private int data;
        private Node next;
        public Node() {
            this.data = -1;
            this.next = null;
        }
        public Node(int val) {
            this.data = val;
            this.next = null;
        }
    }
    private Node front;
    private Node rear;
    private int userSize;



    public TwoQueueToOneStack() {
        this.front = null;
        this.rear = null;
        this.userSize = 0;
    }

    //�Ƿ��
    public boolean isEmpty() {
        if (this.userSize == 0) {
            return true;
        }
        return false;
    }
    //���
    public void push(int val) {
        if (isEmpty()) {
            this.front = new Node(val);
            this.rear = this.front;
        }else {
            rear.next = new Node(val);
            rear = rear.next;
        }
        this.userSize++;
    }
    //����
    public int pop() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("ջΪ��");
        }
        Node deleteNode = this.front;
        this.front = deleteNode.next;
        --this.userSize;
        return deleteNode.data;
    }

    //��������ĳ��������ʣ��һ��ֵ��Ϊɾ����ֵ
    public static void enterStack(TwoQueueToOneStack qu1, TwoQueueToOneStack qu2, int val) {
        if (!qu1.isEmpty()) {
            qu1.push(val);
        }else {
            qu2.push(val);
        }
    }
    public static int popStack(TwoQueueToOneStack qu1, TwoQueueToOneStack qu2) {
        int temp;
        if (!qu1.isEmpty()) {
            while (qu1.userSize > 1) {
                qu2.push(qu1.pop());
            }
            temp = qu1.pop();
        }else {
            while (qu2.userSize > 1) {
                qu1.push(qu2.pop());
            }
            temp = qu2.pop();
        }
        return temp;
    }

    //��ӡ
    public static void show(TwoQueueToOneStack qu1, TwoQueueToOneStack qu2) {
        if (!qu1.isEmpty()) {
            Node cur = qu1.front;
            while (cur != null) {
                System.out.println(cur.data + " ");
                cur = cur.next;
            }
            System.out.println();
        }else {
            Node cur = qu2.front;
            while (cur != null) {
                System.out.println(cur.data + " ");
                cur = cur.next;
            }
            System.out.println();
        }
    }

}
public class TwoQueueToOneStackDemo {
    public static void main(String[] args) {

        TwoQueueToOneStack qu1 = new TwoQueueToOneStack();
        TwoQueueToOneStack qu2 = new TwoQueueToOneStack();


        TwoQueueToOneStack.enterStack(qu1, qu2, 1);
        TwoQueueToOneStack.enterStack(qu1, qu2, 2);
        TwoQueueToOneStack.enterStack(qu1, qu2, 3);

        System.out.println(TwoQueueToOneStack.popStack(qu1, qu2));//3
        System.out.println("======");
        TwoQueueToOneStack.show(qu1, qu2);//1 2
        System.out.println("======");
        TwoQueueToOneStack.enterStack(qu1, qu2, 4);
        TwoQueueToOneStack.enterStack(qu1, qu2, 5);
        TwoQueueToOneStack.enterStack(qu1, qu2, 6);
        System.out.println(TwoQueueToOneStack.popStack(qu1, qu2));//6

        System.out.println("======");
        TwoQueueToOneStack.show(qu1, qu2);//1 2 4 5


    }
}
