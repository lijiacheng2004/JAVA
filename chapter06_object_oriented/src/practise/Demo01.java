package practise;

import java.util.Arrays;
import java.util.Scanner;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: demo01
 * Package: practise._01
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/16 11:29
 * @Version 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入整数：");
        int num=scanner.nextInt();
        System.out.println("请输入长度：");
        int length=scanner.nextInt();
        int[] arr=new int[length];
        for (int i = 0; i < length; i++) {
            arr[i]=num%10;
            num=num/10;
        }
        System.out.println(Arrays.toString(arr));//输出数组的内容
        System.out.println(arr);//输出数组的地址 引用类型变量 变量名的值为地址
    }
}
