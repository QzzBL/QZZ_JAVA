package test_ind_code.qzz.queue;

/**
 * @ClassName TestQueueDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2018/12/6 22:38
 * @Title Ը�ϲ��к���֮��
 * @Description:
 **/
class QueueDemo {
    private int front;//��ͷ
    private int rear;//��β
    private int[] elem;
    private int usedSize = 0;
    private int allSize = 8;
    public QueueDemo() {
        this(10);
    }
    public QueueDemo(int size) {
        this.front = 0;
        this.rear = 0;
        this.elem = new int[size];
    }
    //�Ƿ��
    public boolean isEmpty() {
        if (this.front == this.rear) {
            return true;
        }
        return false;
    }
    //�Ƿ���
    public boolean isFull() {
        if (( this.rear + 1) % allSize == this.front) {
            return true;
        }
        return false;
    }
    //���
    public void push(int val) {
        if (isFull()) {
            return;
        }
        this.elem[this.rear] = val;//����this.elem[this.rear++] = val
        this.rear = (this.rear + 1) % allSize;
        this.usedSize++;
    }
    //����
    public int pop() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("����Ϊ��");
        }
        int num = this.elem[this.front];//��¼ɾ����Ԫ��
        this.elem[this.front] = -1;//����������������ã�����ط���Ҫ��Ϊnull
        this.front = (this.front + 1) % allSize;
        --this.usedSize;
        return num;
    }
    //��ӡ
    public void show() {
        for (int i = this.front; i != this.rear; i = (i + 1) % allSize){
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    public int getUsedSize() {
        return this.usedSize;
    }
}
public class TestQueueDemo {
    public static void main(String[] args) {
        QueueDemo queueDemo = new QueueDemo();
        for (int i = 0; i < 20; i++) {
            queueDemo.push(i);
        }
        queueDemo.show();
        //queueDemo.pop();
        //queueDemo.pop();
        queueDemo.show();

        System.out.println(queueDemo.getUsedSize());
    }
}

