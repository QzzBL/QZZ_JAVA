class Dlink {
    class Node {
        private int data;
        private Node next;
        private Node pre;
        public Node () {
            this.data = -1;
            this.pre = null;
            this.next = null;
        }
        public Node (int val) {
            this.data = val;
            this.pre = null;
            this.next = null;
        }
    }
    private Node head;

    public Dlink () {
        this.head = new Node();
    }

    //头插法
    public void insertHead (int val) {
        Node cur = new Node(val);
        cur.next = this.head.next;
        cur.pre = this.head;
        this.head.next = cur;
        if (cur.next != null) {
            cur.next.pre = cur;
        }
    }
    //尾插法
    public void insertTail (int val) {
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        Node newCur = new Node(val);
        cur.next = newCur;
        newCur.pre = cur;
    }
    //删除所有值为val的节点
    public void deleteAllVal (int val) {
        Node cur = this.head.next;
        while (cur != null) {
            if (cur.data == val) {
                cur.pre.next = cur.next;
                if(cur.next != null) {
                    cur.next.pre = cur.pre;
                }
            }
            cur = cur.next;
        }
    }
    //打印
    public void show () {
        Node cur = this.head.next;
        while (cur != null) {
            System.out.println(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
public class TestDlinkDemo {
    public static void main(String[] args) {
        Dlink dlink = new Dlink();

        /*dlink.insertHead(1);
        dlink.insertHead(2);
        dlink.insertHead(3);
        dlink.insertHead(4);
        dlink.insertHead(5);*/

        dlink.insertTail(1);
        dlink.insertTail(1);
        dlink.insertTail(3);
        dlink.insertTail(4);
        dlink.insertTail(1);

        dlink.show();
        dlink.deleteAllVal(1);
        dlink.show();
    }
}