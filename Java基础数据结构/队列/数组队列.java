package test_ind_code.qzz.queue;

/**
 * @ClassName TestQueueDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2018/12/6 22:38
 * @Title 愿上苍有好生之德
 * @Description:
 **/
class QueueDemo {
    private int front;//队头
    private int rear;//队尾
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
    //是否空
    public boolean isEmpty() {
        if (this.front == this.rear) {
            return true;
        }
        return false;
    }
    //是否满
    public boolean isFull() {
        if (( this.rear + 1) % allSize == this.front) {
            return true;
        }
        return false;
    }
    //入队
    public void push(int val) {
        if (isFull()) {
            return;
        }
        this.elem[this.rear] = val;//不能this.elem[this.rear++] = val
        this.rear = (this.rear + 1) % allSize;
        this.usedSize++;
    }
    //出队
    public int pop() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("队列为空");
        }
        int num = this.elem[this.front];//记录删除的元素
        this.elem[this.front] = -1;//如果队列里面是引用，这个地方需要置为null
        this.front = (this.front + 1) % allSize;
        --this.usedSize;
        return num;
    }
    //打印
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

