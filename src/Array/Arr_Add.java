package Array;

import java.util.Arrays;
//数组特定位置插入数据
public class Arr_Add {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        System.out.println(Arrays.toString(arr));
        int index = 1;
        for (int i =arr.length-1; i >index-1 ; i--) {
            arr[i] = arr[i-1];
        }arr[index] = 33;
        System.out.println(Arrays.toString(arr));
    }
}
