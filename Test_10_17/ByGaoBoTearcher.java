/**
 * @ClassName ByGaoBoTearcher
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/17 22:49
 * @Title 愿上苍有好生之德
 **/
//求连续子数组的最大和？？？{10,2，-1,9，-10，-99}最小值：不能超过0x80000000
/*public class ByGaoBoTearcher {
    //fangfa1:时间复杂度：O(n^2) 低效
    public static int maxVal(int[] array) {
        int max = Integer.MIN_VALUE;//0X80000000
        if(array == null) {
            return max;
        }
        int sum = 0;
        for(int i = 0;i < array.length;i++) {
            sum = 0;
            for(int j = i;j < array.length;j++) {
                sum += array[j];
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    //fangfa2: 时间复杂度n
    public static int maxVal2(int[] array) {
        int max = Integer.MIN_VALUE;//0X80000000
        int sum = 0;
        //9  -1  9  -100
        for(int i = 0;i < array.length;i++) {
            if(sum <= 0) {
                sum = array[i];//10
            } else {
                sum += array[i];//9   18  -
            }
            if(sum > max) {
                max = sum;//18
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {11 ,-1 , 9, -100};
        int max = maxVal2(array);
        System.out.println(max);
    }
}*/

//实现二分查找算法：有序的数组
/*public class ByGaoBoTearcher {
public static int binarySearch(int[] array,int val) {
    int low = 0;
    int high = array.length-1;
    while(low <= high) {
        int mid = (low+high)>>>1;//(low+(high-low))/2;
        if(array[mid] > val) {
            high = mid - 1;
        } else if(array[mid] < val) {
            low = mid+1;
        } else {
            return mid;
        }
    }
    return -(low+1);
}

    public static void main(String[] args) {
    int[] array = {1,2,3,4,5};
    //int key = 2;//返回1
        int key = 100;//返回-6    //return -(low+1);  low = mid+1  开始low = 0； high = 4；   负号代表没有此数
        //int key = -9;//返回-1
        System.out.println(binarySearch(array,key));
    }
}
*/
//交换两个数？
 class MyVlue {
    int data;
}
public class ByGaoBoTearcher{
    public static void swap(MyVlue myVlue,MyVlue myVlue2) {
        int tmp = myVlue.data;
        myVlue.data = myVlue2.data;
        myVlue2.data = tmp;
    }
    public static void main(String[] args) {
        MyVlue myVlue = new MyVlue();
        myVlue.data = 10;
        MyVlue myVlue2 = new MyVlue();
        myVlue2.data = 20;
        swap(myVlue,myVlue2);
        System.out.println(myVlue.data);//20
        System.out.println(myVlue2.data);//10
    }
}