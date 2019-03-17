/**
 * @ClassName Test1
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/21 21:00
 * @Title 愿上苍有好生之德
 * @Description:
 **/

/**
 * 作业:
 * 删除相同val的值 只需要遍历一遍
 * 打印单链表所有的数据
 */

class LinkList {

    class Node {
        public int data;
        public Node next;
        public Node() {
            this.data = -1;
            this.next = null;
        }
        public Node(int val) {
            this.data = val;
            this.next = null;
        }
        //头插法
        public void insearHead(int val) {
            Node cur = new Node(val);
            cur.next = head.next;
            head.next = cur;
        }
        //尾插法
        public void insearTail(int val) {
            //Node cur = new Node(val);
            Node cur = head;
            while (cur != null){
                cur = cur.next;
            }
            Node finalNode = new Node(val);
            cur.next = finalNode;
        }
        //得到单链表的长度
        public int getLength() {
            int count = 0;
            Node cur = head.next;
            while (cur != null) {
                count++;
                cur = cur.next;
            }
            return count;
        }

        //任意位置插入
        public void insearPos(int pos, int val) {
            if(pos < 1 || pos > getLength()) {
                return;
            }
            Node cur = head.next;
            int count = 1;
            while (count < pos) {
                cur = cur.next;
                count++;
            }
            Node finalNode = new Node(val);
            finalNode.next = cur.next;
            cur.next = finalNode;
        }
        //删除相同val的值

        //打印单链表所有的数据
        public void show() {
            Node cur = head.next;
            //int count = 1;
            while (cur != null) {
                cur = cur.next;
                System.out.println(cur.data);
            }
        }
    }
    public LinkList(){
        Node node = new Node();
    }

    Node head;


}
public class Test1 {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();

    }
}
