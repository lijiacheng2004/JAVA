package practise._08;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: ArrayCopyDemo
 * Package: practise._08
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/28 18:55
 * @Version 1.0
 */

import java.util.Arrays;

/**
 * 1.Arrays.copyOf();   -----基于原数组内容基础上进行扩容或缩容的操作
 * 2.System.arrayCopy();-----基于已知2个数组，例如 A数组将数据 拷贝给 B数组
 */
public class ArrayCopyDemo {
    public static void main(String[] args) {
        //1.
        int[] array={10,20,30};
        System.out.println("扩容前数组长度"+array.length);
        int a=10;
        //Arrays.copyOf: 1.处理原数组对象 2.基于原数组的长度增加或减少
        array=Arrays.copyOf(array, array.length+1);
        System.out.println("扩容后数组长度"+array.length);
        array[array.length-1]=a;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //2.
        int[] arrA={1,2,3};
        int[] arrB={0,0,0};
        /**arraycopy
         * 1.拷贝的原数组
         * 2,从原数组哪个下标进行拷贝
         * 3.拷贝的目标数组
         * 4.从目标数组那个下标开始装
         * 5.拷贝的长度. 注意，不能超过原数组开始拷贝下标后的长度
         *                  不能超过目标数组开始装的下标后的长度
         */
        System.arraycopy(arrA, 0, arrB, 0, 3);
        for (int i = 0; i < arrB.length; i++) {
            System.out.println(arrB[i]);
        }
    }
}
