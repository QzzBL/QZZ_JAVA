import java.util.Arrays;

/**
 * @ClassName NewTest
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/21 22:55
 * @Title Ը�ϲ��к���֮��
 * @Description:
 **/
class TestSqlist {
    private int[] elem;//������ݵ�����
    private int usedsize;//��Ч���ݸ���

    public TestSqlist() {
        this(10);
    }//����ʼֵ

    public TestSqlist(int size) {
        this.elem = new int[size];
    }
    //��ʼһϵ�� ��ɾ����Ĳ���

    /**
     * ˼��
     * 1.�ж����������ô�� this.usedsize == this.elem.length
     * 2.���Ϊ����ô��
     * 3.������Ϊһ��ʼû�����ݣ�����������
     */

    //1.�ж����������ô��
    public boolean isFull() {
        if (this.usedsize == this.elem.length) {
            return true;
        }
        return false;
    }
    //2.���Ϊ����ô��
    public boolean isEmpty() {
        if (this.usedsize == 0) {
            return true;
        }
        return false;
    }
    //3.����Ԫ��
    public boolean insear(int pos, int val) {
        if(isFull()) {
            this.elem = Arrays.copyOf(this.elem, this.elem.length * 2);
        }
        //��Ϊ��: pos ���� < 0 , ���� pos > this.usedsize
        if(pos < 0 || pos > this.usedsize){
            return false;
        }else{
            for(int i = usedsize - 1; i >= pos ; i--){
                this.elem[i + 1] = this.elem[i];
            }
            this.elem[pos] = val;
            this.usedsize++;
        }
        return true;
    }
    //4.���ҹؼ���key�±�
    public int search(int key) {
        if(isEmpty()){
            return -1;
        }else{
            for (int i = 0; i < this.usedsize; i++) {
                if(this.elem[i] == key){
                    return i;
                }
            }
        }
        throw new UnsupportedOperationException("���Ϸ�����");
    }
    //5..ɾ��
    public boolean delete(int key) {
        //�����Ƿ��йؼ���key  index �±�--��  ���±�ķ��� search����
        int index = search(key);
        //�����:��ʼɾ�� ���ҵ��������±꿪ʼ
        if(index < 0){
            return false;
        }
        for(int i = index; i < this.usedsize - 1; i++){
            this.elem[i] = this.elem[i + 1];
        }
        usedsize--;
        return true;
    }
    //6.�õ�posλ�õ�ֵ ǣ���� �±� �������У���Ҫ�ж��Ƿ�С����С�±���ߣ��������
    public int getPos(int pos) {
        if(pos < 0 || pos > this.usedsize || isEmpty()){
            //return - 1; ������������- 1
            throw new UnsupportedOperationException("pos��λ�ò��Ϸ��쳣");
        }
        return this.elem[pos];
    }
    //7.��ӡ
    public void show() {
        for (int i = 0; i < this.usedsize; i++){
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }
}
public class NewTest {
    public static void main(String[] args) {
        TestSqlist testSqlist = new TestSqlist();
        for (int i = 0; i < 10; i++){
            testSqlist.insear(i, i);
        }
        testSqlist.show();
        testSqlist.insear(10,2);
        testSqlist.insear(3,5);
        testSqlist.show();
        System.out.println("---------------------");
        System.out.println(testSqlist.search(6));
        System.out.println("---------------------");
        testSqlist.delete(4);
        testSqlist.show();
        System.out.println("---------------------");
        System.out.println(testSqlist.getPos(6));
        System.out.println("---------------------");
        System.out.println(testSqlist.getPos(-1));
        System.out.println("---------------------");
        System.out.println(testSqlist.search(-3));
    }
}
