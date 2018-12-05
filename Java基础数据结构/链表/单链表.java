package pri.qzz.testlink;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.LinkedList;

/**
 * @ClassName TestLink
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/27 12:31
 * @Title 愿上苍有好生之德
 * @Description:
 *
 * 1.写链表类，类里写节点类
 * 2.数据域，指针域
 * 3.节点类里，无参构造函数（为头节点准备），有参构造函数（为增加节点准备）
 * 4.头引用，链表类中，无参构造函数里面写生成头结点对象（main中生成链表类对象时，头结点对象就生成了）
 *
 *
 * 1.头插法，插入数据
 * 2.尾插法
 * 3.得到单链表长度（数据节点个数）
 * 4.任意的位置插入
 * 5.删除节点
 * 6.删除值为val的节点
 * 7.打印单链表数据
 * 8.返回下标
 * 9.删除单链表当中所有值为val的节点   O(n)
 * 10.对链表进行排序(冒泡)
 * 11.找到倒数第K个节点
 * 12.删除倒数第k个节点
 * 13.创建一个环
 * 14.查找是否有环
 * 15.求环的入口点
 * 16.求环的长度
 * 17.单链表的逆置？(使用头插法逆置)
 * 18.单链表的反转
 * 19.O(1)时间复杂度
 * 20.非递归合并两个有序的递增的单链表
 **/
public class TestLink {
    class Node {
        int data;
        Node next;

        public Node() {
            this.data = data;
            this.next = null;
        }

        public Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    public Node getHead() {
        return head;
    }

    private Node head;

    public TestLink() {
        this.head = new Node();
    }

    //1.头插法
    public void insertHead(int val) {
        Node cur = new Node(val);
        cur.next = this.head.next;
        this.head.next = cur;
    }

    //2.尾插法
    public void insertTail(int val) {
        Node cur = this.head;
        while (cur.next != null) {//找到最后一个为空的节点
            cur = cur.next;
    }
        Node endNode = new Node(val);//生成新节点
        cur.next = endNode;//和之前找到的后面为空的节点链接
    }

    //3.得到单链表长度（数据节点个数）
    public int getLength() {
        Node cur = this.head;
        int count = 0;
        while (cur.next != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    //4.任意的位置插入
    public void insertPos(int pos, int val) {
        if (pos < 0 || pos > getLength()) {
            return;
        }
        Node cur = this.head;
        for (int i = 0; i < pos; i++) {//找到上一个节点
            cur = cur.next;
        }
        Node newNode = new Node(val);
        newNode.next = cur.next;
        cur.next = newNode;
    }

    //5.删除节点（多种写法，也可以有count代表第几个节点和pos相等进行删除）
    public void deletePos(int pos) {
        if (pos < 0 || pos > getLength()) {
            return;
        }
        Node cur = this.head;
        Node deleteCur = this.head.next;
        for (int i = 0; i < pos; i++) {
            //当前节点的上一个节点
            cur = cur.next;
            deleteCur = cur.next;
        }
        cur.next = deleteCur.next;
    }

    //6.删除值为val的节点
    public void deleteVal(int val) {
        Node cur = this.head.next;
        Node pre = this.head;
        while (cur != null) {
            if (cur.data == val) {
                pre.next = cur.next;
            }
            cur = cur.next;
            pre = pre.next;
        }
    }

    //7.打印单链表数据
    public void print() {
        Node cur = this.head;
        while (cur.next != null) {
            System.out.print(cur.next.data + " ");
            cur = cur.next;
        }
    }
    //7.1打印反转后单链表数据  you wen ti  传入reverHead
    public void contraryPrint(Node reverHead) {
        Node cur = reverHead;
        while (cur.next != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    //8.返回下标
    public int findPos(int val) {
        int index = 0;
        Node cur = this.head.next;
        while (cur != null) {
            if (cur.data == val) {
                index++;
                return index;
            }
            cur = cur.next;
        }
        return -1;
    }

    //9.删除单链表当中所有值为val的节点   O(n)
    public void deleteAllVal(int val) {
        Node cur = this.head.next;
        Node pre = this.head;
        while (cur != null) {
            if (cur.data == val) {
                pre.next = cur.next;
                cur = cur.next;
            } else {
                cur = cur.next;
                pre = pre.next;
            }
        }
    }

    //10.对链表进行排序(冒泡)
    public void sortBubble() {
        Node cur;
        Node runByRun;
        int temp;
        for (cur = this.head.next; cur.next != null; cur = cur.next) {
            for (runByRun = this.head.next; runByRun.next != null; runByRun = runByRun.next) {
                if (runByRun.data > runByRun.next.data) {

                    temp = runByRun.data;
                    runByRun.data = runByRun.next.data;
                    runByRun.next.data = temp;
                }
            }
        }
    }

    //11.找到倒数第K个节点
    public int findLastPosVal(int pos) {
        if (pos < 0 || pos > getLength()) {
            throw new UnsupportedOperationException("Pos不合法");
        }
        Node cur = this.head;
        Node pre = this.head;
        while (pos - 1 > 0) {
            cur = cur.next;
            --pos;
        }
        while (cur.next != null) {
            cur = cur.next;
            pre = pre.next;
        }
        return pre.data;
    }

    //12.删除倒数第k个节点
    public void deleteLastPos(int pos) {
        if (pos < 0 || pos > getLength()) {
            throw new UnsupportedOperationException("Pos不合法");
        }
        Node cur = this.head;
        Node pre = this.head;
        while (pos > 0) {
            cur = cur.next;
            --pos;
        }
        while (cur.next != null) {
            cur = cur.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;
    }

    //13.创建一个环
    public void createLoop() {
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = this.head.next.next;
    }

    //14.查找是否有环()快慢指针
    public boolean isLoop() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    //15.求环的入口点
    public int getEnterNode() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                break;
            }
        }
        slow = this.head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast.data;
    }
    //16.求环的长度
    public int getLoopLenth() {
        Node fast = this.head;
        Node slow = this.head;
        boolean flg = false;
        int len = 0;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow && flg == true) {
                break;
            }
            if (slow == fast && flg == false) {
                flg = true;
            }
            if (flg == true) {
                len++;
            }
        }
        return len;
    }
    //17.单链表的逆置？(使用头插法逆置)
    public void reverse() {

        Node cur = this.head.next;
        Node curNode = null;
        this.head.next = null;
        while (cur != null) {
            curNode = cur.next;

            cur.next = this.head.next;
            this.head.next = cur;
            cur = curNode;
        }
    }

    //18.单链表的反转
    public Node contrary() {
        Node cur = this.head;
        Node curNext;
        Node pre = null;
        Node reverHead;
        while (cur != null) {
            curNext = cur.next;
         /*   if (curNext == null) {
                reverHead = cur;
            }*/
            cur.next = pre;//后面指针域指向前面地址
            pre = cur;
            cur = curNext;
        }
        reverHead = pre;
        return reverHead;
    }
    //19.O(1)时间复杂度
    public void deleteNode (Node nodeStart, Node nodeDelete) {
        if (nodeDelete.next != null) {//如果删除的不是尾节点
            Node nodeDeleteNext = nodeDelete.next;
            nodeDelete.data = nodeDeleteNext.data;
            nodeDelete.next = nodeDeleteNext.next;
            nodeDeleteNext = null;
        }else if (nodeStart == nodeDelete) {
            nodeStart = null;
            nodeDelete = null;
        }else {//尾节点
            //尾节点的前驱
            Node cur = nodeStart;
            while (cur.next != nodeDelete) {
                cur = cur.next;
            }
            //cur ==> 尾节点的前驱
            cur.next = null;
            nodeDelete = null;
        }
        return;
    }



    public static boolean isCut(TestLink testLink1,TestLink testLink2) {
        TestLink.Node head1 = testLink1.getHead();//指向长的单链表
        TestLink.Node head2 = testLink2.getHead();//指向短的单链表
        int len1 = testLink1.getLength();
        int len2 = testLink2.getLength();
        int myLen = len1-len2;
        if(myLen < 0) {
            head1 = testLink2.getHead();
            head2 = testLink1.getHead();
            myLen = len2-len1;
        }
        //head1===>指向长的单链表
        for (int i = 0; i < myLen; i++) {
            head1 = head1.next;
        }
        while(head1 != head2 && head1 != null && head2 != null) {
            head1 = head1.next;
            head2 = head2.next;
        }

        if(head1 == head2 && head1 != null && head2 != null) {
            return true;
        }
        return false;
    }

    //20.非递归合并两个有序的递增的单链表
    public static TestLink.Node mergeLink(TestLink link1,TestLink link2){
        TestLink.Node newHead = null;//返回的头结点
        /*TestLink.Entry p1 = link1.getHead().next;
        TestLink.Entry p2 = link2.getHead().next;*/
        TestLink.Node p1 = link1.getHead();
        TestLink.Node p2 = link2.getHead();
        if(p1.next.data < p2.next.data) {
            //newHead = link1.getHead();
            newHead = p1;
        } else {
            //newHead = link2.getHead();
            newHead = p2;
        }
        p1 = p1.next;
        p2 = p2.next;
        TestLink.Node tmpHead = newHead;
        while(p1 != null && p2 != null) {
            if(p1.data < p2.data) {
                tmpHead.next = p1;
                p1 = p1.next;
            } else {
                tmpHead.next = p2;
                p2 = p2.next;
            }
            tmpHead = tmpHead.next;
        }
        if(p1 == null) {
            tmpHead.next = p2;
        }
        if(p2 == null) {
            tmpHead.next = p1;
        }
        return newHead;
    }

    //打印合并后的单链表
    public static void showMerge(TestLink.Node entry){
        TestLink.Node  cur = entry.next;
        while(cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }
}
//zoomlt
