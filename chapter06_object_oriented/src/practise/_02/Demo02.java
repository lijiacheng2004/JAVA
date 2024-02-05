package practise._02;

import java.util.Arrays;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: demo02
 * Package: practise._02
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/16 12:42
 * @Version 1.0
 */
public class Demo02 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8};
        int[] arr2=operation(arr1);
        System.out.println(Arrays.toString(arr2));
    }
    static int[] operation(int[] arr){
        int idx=arr.length/2;
        int temp;
        for(int i=0;i<=idx-1;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return arr;
    }
}
