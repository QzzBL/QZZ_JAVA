package pri.qzz.testlink;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.LinkedList;

/**
 * @ClassName TestLink
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/27 12:31
 * @Title Ը�ϲ��к���֮��
 * @Description:
 *
 * 1.д�����࣬����д�ڵ���
 * 2.������ָ����
 * 3.�ڵ�����޲ι��캯����Ϊͷ�ڵ�׼�������вι��캯����Ϊ���ӽڵ�׼����
 * 4.ͷ���ã��������У��޲ι��캯������д����ͷ������main���������������ʱ��ͷ������������ˣ�
 *
 *
 * 1.ͷ�巨����������
 * 2.β�巨
 * 3.�õ��������ȣ����ݽڵ������
 * 4.�����λ�ò���
 * 5.ɾ���ڵ�
 * 6.ɾ��ֵΪval�Ľڵ�
 * 7.��ӡ����������
 * 8.�����±�
 * 9.ɾ��������������ֵΪval�Ľڵ�   O(n)
 * 10.�������������(ð��)
 * 11.�ҵ�������K���ڵ�
 * 12.ɾ��������k���ڵ�
 * 13.����һ����
 * 14.�����Ƿ��л�
 * 15.�󻷵���ڵ�
 * 16.�󻷵ĳ���
 * 17.����������ã�(ʹ��ͷ�巨����)
 * 18.������ķ�ת
 * 19.O(1)ʱ�临�Ӷ�
 * 20.�ǵݹ�ϲ���������ĵ����ĵ�����
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

    //1.ͷ�巨
    public void insertHead(int val) {
        Node cur = new Node(val);
        cur.next = this.head.next;
        this.head.next = cur;
    }

    //2.β�巨
    public void insertTail(int val) {
        Node cur = this.head;
        while (cur.next != null) {//�ҵ����һ��Ϊ�յĽڵ�
            cur = cur.next;
    }
        Node endNode = new Node(val);//�����½ڵ�
        cur.next = endNode;//��֮ǰ�ҵ��ĺ���Ϊ�յĽڵ�����
    }

    //3.�õ��������ȣ����ݽڵ������
    public int getLength() {
        Node cur = this.head;
        int count = 0;
        while (cur.next != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    //4.�����λ�ò���
    public void insertPos(int pos, int val) {
        if (pos < 0 || pos > getLength()) {
            return;
        }
        Node cur = this.head;
        for (int i = 0; i < pos; i++) {//�ҵ���һ���ڵ�
            cur = cur.next;
        }
        Node newNode = new Node(val);
        newNode.next = cur.next;
        cur.next = newNode;
    }

    //5.ɾ���ڵ㣨����д����Ҳ������count����ڼ����ڵ��pos��Ƚ���ɾ����
    public void deletePos(int pos) {
        if (pos < 0 || pos > getLength()) {
            return;
        }
        Node cur = this.head;
        Node deleteCur = this.head.next;
        for (int i = 0; i < pos; i++) {
            //��ǰ�ڵ����һ���ڵ�
            cur = cur.next;
            deleteCur = cur.next;
        }
        cur.next = deleteCur.next;
    }

    //6.ɾ��ֵΪval�Ľڵ�
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

    //7.��ӡ����������
    public void print() {
        Node cur = this.head;
        while (cur.next != null) {
            System.out.print(cur.next.data + " ");
            cur = cur.next;
        }
    }
    //7.1��ӡ��ת����������  you wen ti  ����reverHead
    public void contraryPrint(Node reverHead) {
        Node cur = reverHead;
        while (cur.next != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    //8.�����±�
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

    //9.ɾ��������������ֵΪval�Ľڵ�   O(n)
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

    //10.�������������(ð��)
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

    //11.�ҵ�������K���ڵ�
    public int findLastPosVal(int pos) {
        if (pos < 0 || pos > getLength()) {
            throw new UnsupportedOperationException("Pos���Ϸ�");
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

    //12.ɾ��������k���ڵ�
    public void deleteLastPos(int pos) {
        if (pos < 0 || pos > getLength()) {
            throw new UnsupportedOperationException("Pos���Ϸ�");
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

    //13.����һ����
    public void createLoop() {
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = this.head.next.next;
    }

    //14.�����Ƿ��л�()����ָ��
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

    //15.�󻷵���ڵ�
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
    //16.�󻷵ĳ���
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
    //17.����������ã�(ʹ��ͷ�巨����)
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

    //18.������ķ�ת
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
            cur.next = pre;//����ָ����ָ��ǰ���ַ
            pre = cur;
            cur = curNext;
        }
        reverHead = pre;
        return reverHead;
    }
    //19.O(1)ʱ�临�Ӷ�
    public void deleteNode (Node nodeStart, Node nodeDelete) {
        if (nodeDelete.next != null) {//���ɾ���Ĳ���β�ڵ�
            Node nodeDeleteNext = nodeDelete.next;
            nodeDelete.data = nodeDeleteNext.data;
            nodeDelete.next = nodeDeleteNext.next;
            nodeDeleteNext = null;
        }else if (nodeStart == nodeDelete) {
            nodeStart = null;
            nodeDelete = null;
        }else {//β�ڵ�
            //β�ڵ��ǰ��
            Node cur = nodeStart;
            while (cur.next != nodeDelete) {
                cur = cur.next;
            }
            //cur ==> β�ڵ��ǰ��
            cur.next = null;
            nodeDelete = null;
        }
        return;
    }



    public static boolean isCut(TestLink testLink1,TestLink testLink2) {
        TestLink.Node head1 = testLink1.getHead();//ָ�򳤵ĵ�����
        TestLink.Node head2 = testLink2.getHead();//ָ��̵ĵ�����
        int len1 = testLink1.getLength();
        int len2 = testLink2.getLength();
        int myLen = len1-len2;
        if(myLen < 0) {
            head1 = testLink2.getHead();
            head2 = testLink1.getHead();
            myLen = len2-len1;
        }
        //head1===>ָ�򳤵ĵ�����
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

    //20.�ǵݹ�ϲ���������ĵ����ĵ�����
    public static TestLink.Node mergeLink(TestLink link1,TestLink link2){
        TestLink.Node newHead = null;//���ص�ͷ���
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

    //��ӡ�ϲ���ĵ�����
    public static void showMerge(TestLink.Node entry){
        TestLink.Node  cur = entry.next;
        while(cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }
}
//zoomlt
