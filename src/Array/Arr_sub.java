package Array;

import java.util.Arrays;
//删除数组某一位值
public class Arr_sub {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60};
        System.out.println(Arrays.toString(arr));
        int index = 1;
        for (int i = index; i <arr.length ; i++) {
            arr[i-1] = arr [i];
        }arr[arr.length-1] = 0;
        System.out.println(Arrays.toString(arr));
//排序，选出最大值
        int max = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max = arr[i];
            }

        }System.out.println(max);
    }


}
