import java.util.Arrays;

/**
 * @ClassName Test
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/21 18:55
 * @Title 愿上苍有好生之德
 * @Description:
 **/
/*
public class Test {
    private int[] elem =;
    private int usedsize;

    public Test(){
        this(10);
    }
    public Test(int size){
        this.elem = new int[size];
        this.usedsize = 0;
    }
    public boolean isFull() {
        if(this.usedsize == this.elem.length) {
            return true;
        }else{
            return false;
        }
    }

    public boolean insert(int pos, int val){
        if(isFull()){
            this.elem = Arrays.copyOf(this.elem, this.elem.length * 2);
        }else{
            if(pos < 0 || pos > this.usedsize + 1){
                return false;
            }
            this.elem[pos] = val;
            this.usedsize++;
        }
    }

    public boolean isEmpty(int key){
        if(this.usedsize == 0) {
            return false;
        }
    }
    public int search(int key) {
        for(int i = 0; i < elem.length; i++) {
            if(i == elem[key]){
                System.out.println(i);
                break;
            }
        }
        return 1;
    }

    //删除
    public boolean delect(int pos ,int key) {
        int i = search(key);
        for (int i = pos; i < usedsize; i++ ) {
            this.elem[i] = this.elem[i + 1];
        }
        usedsize--;
        return true;
    }

    public int getPos(int pos) {
        if(pos < 0 || pos > this.elem.length){
            return -1;
        }else{
            for (int i = 0; i < usedsize; i++){
                if(i == pos){
                    return this.elem[pos];
                }
            }
        }
        return 1;
    }

    //print
    public void print(){
        for(int i = 0; i < this.elem.length; i++){
            System.out.println(elem[i] + " ");
            }
        }


    public static void main(String[] args) {
        Test test = new Test();
        test.isEmpty(2);
        test.search(2);
        //System.out.println(Arrays.toString(test.insert(3, 6)));

        test.delect(test.search(2),5);
    }
}
*/
