package test_ind_code.qzz.queue;

/**
 * @ClassName LinkQueueDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2018/12/6 23:43
 * @Title Ը�ϲ��к���֮��
 * @Description:
 **/
class LinkQueue {
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

    public LinkQueue() {
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
    //��ӡ
    public void show() {
        Node cur = this.front;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public int getUserSize() {
        return this.userSize;
    }
}
public class LinkQueueDemo {
    public static void main(String[] args) {
        LinkQueue linkQueue = new LinkQueue();
        for (int i = 0; i < 10; i++) {
            linkQueue.push(i);
        }
        linkQueue.show();
        System.out.println(linkQueue.pop());
        linkQueue.show();
        System.out.println(linkQueue.getUserSize());
    }
}

