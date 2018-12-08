package test_ind_code.qzz;

/**
 * @ClassName TestLinkStackDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2018/12/6 13:30
 * @Title 愿上苍有好生之德
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

    //头插法（压栈）
    public void push(int val) {
        Node cur = new Node(val);
        cur.next = this.head.next;
        this.head.next = cur;
    }
    //尾插法（压栈） // 不行 除非改变一下 头的位置，打印也改变
    public void insertTail(int val) {
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        Node newNode = new Node(val);
        cur.next = newNode;
    }
    //出栈
    public void pop() {
        if (this.head.next == null) {
            return;
        }
        Node cur = this.head.next;
        this.head.next = cur.next;
    }
    //得到栈顶元素
    public int getTop() {
        Node cur = this.head.next;
        if (cur != null) {
            return cur.data;
        }
        return -1;
    }
    //打印
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
