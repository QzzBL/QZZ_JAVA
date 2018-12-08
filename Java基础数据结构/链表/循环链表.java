package pri.qzz.testlink;

/**
 * @ClassName TestClinkDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2018/12/5 17:08
 * @Title 愿上苍有好生之德
 * @Description: 循环链表（主要关键在
 * 1、public Clink() {}  中生成了头结点，头结点的next和自己链在一起）
 * 2、以前while() 中不等于null，null换成this.next
 * 3、尾插最后的节点要和头结点链接起来（头插法无所谓和一般链表写法一样）
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

    //头插法
    public void insertHead(int val) {
        Node cur = new Node(val);
        cur.next = this.head.next;
        this.head.next = cur;
    }
    //尾插法
    public void insertTail(int val) {
        Node cur = this.head;
        while (cur.next != this.head) {
            cur = cur.next;
        }
        Node newCur = new Node(val);
        cur.next = newCur;
        newCur.next = this.head;
    }
    //删除所有值为val的节点
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
