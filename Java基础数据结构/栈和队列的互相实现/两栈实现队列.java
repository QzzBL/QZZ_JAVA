package mycalss.qzz.tulun18_12_09;

/**
 * @ClassName TwoStaToQueDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2018/12/9 14:35
 * @Title Ը�ϲ��к���֮��
 * @Description: ��ջʵ�ֶ���
 **/
class TwoStackToOneQueue {
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
    private Node head;
    private int userSize;

    public TwoStackToOneQueue() {
        this.head = new Node();
        this.userSize = 0;
    }

    //�Ƿ��
    public boolean isEmpty() {
        if (this.userSize == 0) {
            return true;
        }
        return false;
    }

    //ͷ�巨��ѹջ��
    public void push(int val) {
        Node cur = new Node(val);
        cur.next = this.head.next;
        this.head.next = cur;

        this.userSize++;
    }

    //��ջ
    public int pop() {
        if (this.head.next == null) {
            return -1;
        }
        Node cur = this.head.next;
        this.head.next = cur.next;

        --this.userSize;
        return cur.data;
    }
    //�õ�ջ��Ԫ��
    public int getTop() {
        if (this.head.next == null) {
            throw new UnsupportedOperationException("ջΪ��");
        }
        return this.head.next.data;
    }

    //qu2����push��ֵ��qu1��ŵ���qu2�ģ�userSize -1 ��ֵ��qu2ʣ��һ��������������qu1�ٵ���qu2��
    public static void pushQueue(TwoStackToOneQueue s1, TwoStackToOneQueue s2, int val) {
        if (!s1.isEmpty()) {
            s1.push(val);
        }else {
            s2.push(val);
        }
    }
    public static int popQueue(TwoStackToOneQueue s1, TwoStackToOneQueue s2) {
        int temp;
        if (!s1.isEmpty()) {
            while (s1.userSize > 1) {
                s2.push(s1.pop());
            }
            temp = s1.pop();
            while (s2.userSize > 0) {
                s2.push(s2.pop());
            }
        }else {
            while (s2.userSize > 1) {
                s1.push(s2.pop());
            }
            temp = s2.pop();
            while (s1.userSize > 0) {//qu1�ٵ���qu2
                s2.push(s1.pop());
            }
        }
        return temp;
    }

    public static void show(TwoStackToOneQueue s1, TwoStackToOneQueue s2) {
        if (!s1.isEmpty()) {
            Node cur = s1.head.next;
            while (cur != null) {
                System.out.println(cur.data + " ");
                cur = cur.next;
            }
            System.out.println();
        }else {
            Node cur = s2.head.next;
            while (cur != null) {
                System.out.println(cur.data + " ");
                cur = cur.next;
            }
        }
    }
}
public class TwoStaToQueDemo {
    public static void main(String[] args) {
        TwoStackToOneQueue s1 = new TwoStackToOneQueue();
        TwoStackToOneQueue s2 = new TwoStackToOneQueue();

        TwoStackToOneQueue.pushQueue(s1, s2, 1);
        TwoStackToOneQueue.pushQueue(s1, s2, 2);
        TwoStackToOneQueue.pushQueue(s1, s2, 3);
        System.out.println(TwoStackToOneQueue.popQueue(s1, s2));//1
        System.out.println("=======");
        TwoStackToOneQueue.show(s1, s2);//2 3
        System.out.println("=======");
        System.out.println(TwoStackToOneQueue.popQueue(s1, s2));//2

        System.out.println("=======");

        TwoStackToOneQueue.pushQueue(s1, s2, 4);
        TwoStackToOneQueue.pushQueue(s1, s2, 5);
        TwoStackToOneQueue.show(s1, s2);//3 4 5

        System.out.println("=======");
        System.out.println(TwoStackToOneQueue.popQueue(s1, s2));//3

    }
}
