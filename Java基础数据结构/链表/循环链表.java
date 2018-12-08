package pri.qzz.testlink;

/**
 * @ClassName TestClinkDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2018/12/5 17:08
 * @Title Ը�ϲ��к���֮��
 * @Description: ѭ��������Ҫ�ؼ���
 * 1��public Clink() {}  ��������ͷ��㣬ͷ����next���Լ�����һ��
 * 2����ǰwhile() �в�����null��null����this.next
 * 3��β�����Ľڵ�Ҫ��ͷ�������������ͷ�巨����ν��һ������д��һ����
 **/
class Clink {
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
    public Node head;

    public Clink() {
        this.head = new Node();
        this.head.next = this.head;
    }

    //ͷ�巨
    public void insertHead(int val) {
        Node cur = new Node(val);
        cur.next = this.head.next;
        this.head.next = cur;
    }
    //β�巨
    public void insertTail(int val) {
        Node cur = this.head;
        while (cur.next != this.head) {
            cur = cur.next;
        }
        Node newCur = new Node(val);
        cur.next = newCur;
        newCur.next = this.head;
    }
    //ɾ������ֵΪval�Ľڵ�
    public void deleteAllVal(int val) {
        Node cur = this.head.next;
        Node pre = this.head;
        while (cur != this.head) {
            if (cur.data == val) {
                pre.next = cur.next;
                cur = pre.next;
            }else {
                pre = cur;
                cur = cur.next;
            }
        }
    }
    public void show() {
        Node cur = this.head.next;
        while (cur != this.head) {
            System.out.println(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
public class TestClinkDemo {
    public static void main(String[] args) {
        Clink Node = new Clink();
        //entry.insertHead(12);
        Node.insertTail(1);
        Node.insertTail(1);
        Node.insertTail(2);
        Node.insertTail(1);
        Node.insertTail(3);

        Node.show();
        Node.deleteAllVal(1);
        Node.show();
    }
}
