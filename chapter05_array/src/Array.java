/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Array
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/10/23 19:53
 * @Version 1.0
 */
public class Array {
    public static void main(String[] args) {
        //1.数组的声明
        //静态初始化
        //1.1声明（1）
        double[] price;
        //1.2初始化
        price=new double[]{12,34,56,78};

        //动态初始化
        String[] foods;
        foods=new String[4];

        //其他方式：
        int[] arr =new int[4];
        int[] arr1={1,2,3,4};

        //2，数组长度
        System.out.println(foods.length);
        System.out.println(price.length);

        //3.遍历
        for(int i=0;i<4;i++){
            System.out.println(foods[i]);
        }

        for(int i=0;i<price.length;i++){
            System.out.println(price[i]);
        }

        //4,默认初始值 ：0 / boolean:false /String:null
        int[] arr2=new int[4];
        System.out.println(arr2[0]);//arr2==0

        //5.内存解析
        //内存区5部分：程序计数器、虚拟机栈（栈）、本地方法栈、堆、方法区

        //与数组相关：eg：int[] arr=new int[]{1,2,3};
        //虚拟机栈：存放局部变量：arr
        //堆：存放数组实体{1,2,3}
    }
}
