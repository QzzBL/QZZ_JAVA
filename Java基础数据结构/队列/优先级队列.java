package mycalss.qzz.tulun18_12_09;

/**
 * @ClassName QueuePrioDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2018/12/9 19:07
 * @Title Ը�ϲ��к���֮��
 * @Description:   
 **/
class QueuePrio {
    class Node {
        private int data;
        private Node next;
        private int prio;
        public Node() {
            this.data = -1;
            this.prio = -1;
            this.next = null;
        }
        public Node(int val, int prio) {
            this.data = val;
            this.prio = prio;
            this.next = null;
        }
    }
    private Node head = null;
    public QueuePrio () {
        this.head = new Node();
    }

    //����
    public boolean insert(int val, int prio) {

        Node cur = this.head;

        while (cur.next != null) {
            if (cur.prio > prio) {
                break;
            }
            cur = cur.next;
        }
        Node newCur = new Node(val, prio);
        newCur.next = this.head.next;
        this.head.next = newCur;
        return true;
    }
    //ɾ��
    public boolean delete() {
        Node cur = this.head.next;
       if (cur != null) {
           this.head.next = cur.next;
       }
       return true;
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
public class QueuePrioDemo {
    public static void main(String[] args) {
        QueuePrio queuePrio = new QueuePrio();
        queuePrio.insert(1,5);
        queuePrio.insert(2,4);
        queuePrio.insert(3,3);
        queuePrio.insert(5,8);
        queuePrio.insert(6,6);
        queuePrio.show();//5 6 1 2 3

        queuePrio.delete();

        queuePrio.show();
    }
}
