package test_ind_code.qzz;

/**
 * @ClassName TestLinkStackDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2018/12/6 13:30
 * @Title Ը�ϲ��к���֮��
 * @Description:
 **/
class TestLinkStack {
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

    public TestLinkStack() {
        this.head = new Node();
    }

    //ͷ�巨��ѹջ��
    public void push(int val) {
        Node cur = new Node(val);
        cur.next = this.head.next;
        this.head.next = cur;
    }
    //β�巨��ѹջ�� // ���� ���Ǹı�һ�� ͷ��λ�ã���ӡҲ�ı�
    public void insertTail(int val) {
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        Node newNode = new Node(val);
        cur.next = newNode;
    }
    //��ջ
    public void pop() {
        if (this.head.next == null) {
            return;
        }
        Node cur = this.head.next;
        this.head.next = cur.next;
    }
    //�õ�ջ��Ԫ��
    public int getTop() {
        Node cur = this.head.next;
        if (cur != null) {
            return cur.data;
        }
        return -1;
    }
    //��ӡ
    public void show() {
        Node cur = this.head.next;
        while (cur != null) {
            System.out.println(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
public class TestLinkStackDemo {
    public static void main(String[] args) {
        TestLinkStack testLinkStack = new TestLinkStack();

        testLinkStack.push(1);
        testLinkStack.push(2);
        testLinkStack.push(3);
        testLinkStack.push(4);
        testLinkStack.push(5);

        testLinkStack.show();
        testLinkStack.pop();

        testLinkStack.show();

        System.out.println(testLinkStack.getTop());
    }
}
