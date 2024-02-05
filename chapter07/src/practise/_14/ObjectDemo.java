package practise._14;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: ObjectDemo
 * Package: practise._14
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/2/2 21:51
 * @Version 1.0
 */

import java.util.Arrays;

/**
 * Object类的使用演示类：
 *    Object是java所有类的父类(顶级父类)
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Object o=new Aoo();//向上造型： 声明父 new子

        Point p=new Point(1, 2);
        System.out.println("x值为："+p.getX()+" y值为："+p.getY());

        //1，toString
        //目的：希望以后打印对象的信息更加方便
        //输出p1对象是一个 类的全包名@内存地址的信息
        //只要打印引用类型变量，默认调用toString()方法
        //希望：打印对象是，是将对象的信息显示出来
        //解决方法：对 toString 重写
        System.out.println(p);

        int[] arr={10,20,30,40,50,60};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        String str="abcdefghi";
        System.out.println(str);


        //2.equals
        Point p1=new Point(1,2);
        Point p2=new Point(1,2);
        System.out.println(p1 == p2);//引用类型 == 比较地址是否相同
        //目的：判断p1中的数据 与 p2中的数据是否相等
        //解决方法：对 equals 重写
        System.out.println(p1.equals(p2));

        String str1="ABC";
        String str2= "ABC";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 == str2);//比较的是地址是否相等
        //目的：判断字符串内容是否相等
        //string的 equals 已经被重写好了，不用我们自己重写
        //解决方法：调用 equals 方法
        System.out.println(str1.equals(str2));//比较内容是否相等
    }
}
class Aoo{

}

class Boo extends Aoo{

}