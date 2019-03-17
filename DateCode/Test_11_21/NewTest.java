import java.util.Arrays;

/**
 * @ClassName NewTest
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/21 22:55
 * @Title 愿上苍有好生之德
 * @Description:
 **/
class TestSqlist {
    private int[] elem;//存放数据的数组
    private int usedsize;//有效数据个数

    public TestSqlist() {
        this(10);
    }//给初始值

    public TestSqlist(int size) {
        this.elem = new int[size];
    }
    //开始一系列 增删，查改操作

    /**
     * 思想
     * 1.判断如果满了怎么办 this.usedsize == this.elem.length
     * 2.如果为空怎么办
     * 3.增：因为一开始没有数据，所以先增加
     */

    //1.判断如果满了怎么办
    public boolean isFull() {
        if (this.usedsize == this.elem.length) {
            return true;
        }
        return false;
    }
    //2.如果为空怎么办
    public boolean isEmpty() {
        if (this.usedsize == 0) {
            return true;
        }
        return false;
    }
    //3.插入元素
    public boolean insear(int pos, int val) {
        if(isFull()) {
            this.elem = Arrays.copyOf(this.elem, this.elem.length * 2);
        }
        //不为空: pos 可能 < 0 , 可能 pos > this.usedsize
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
    //4.查找关键字key下标
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
        throw new UnsupportedOperationException("不合法数据");
    }
    //5..删除
    public boolean delete(int key) {
        //查找是否有关键字key  index 下标--》  找下标的方法 search（）
        int index = search(key);
        //如果有:开始删除 从找到的数组下标开始
        if(index < 0){
            return false;
        }
        for(int i = index; i < this.usedsize - 1; i++){
            this.elem[i] = this.elem[i + 1];
        }
        usedsize--;
        return true;
    }
    //6.得到pos位置的值 牵扯到 下标 在数组中，就要判断是否小于最小下标或者，大于最大
    public int getPos(int pos) {
        if(pos < 0 || pos > this.usedsize || isEmpty()){
            //return - 1; 可能数组中有- 1
            throw new UnsupportedOperationException("pos的位置不合法异常");
        }
        return this.elem[pos];
    }
    //7.打印
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
