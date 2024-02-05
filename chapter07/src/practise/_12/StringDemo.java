package practise._12;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: StringDemo
 * Package: practise._12
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/2/1 20:02
 * @Version 1.0
 */

/**
 * String类的使用演示类:
 *
 * String创建的方式:
 *   一.静态初始化(可以复用)
 *      1.以字符串字面量的形式创建的字符串对象  例如: String a = "123";
 *      2.字符串常量  static final String B ="123";
 *      3.以字符串字面的形式拼接的字符串对象   例如: String c = "1" +"23";
 *   二.动态初始化(不可复用)
 *      1.使用new关键字进行创建的字符串对象  例如: Stirng d = new String("123");
 *      2.使用String类型的变量拼接而成的字符串. 例如: String d1 = "1";  String e = d1 +"23";
 */

public class StringDemo {
    static final String STR="ABC";
    public static void main(String[] args) {
        /*String str1="ABC";
        String str2=str1;//str1 的地址赋值给 str2 此时两者共享一个内存地址
        str1=str1+"DEF";
        System.out.println(str1);//ABCDEF
        System.out.println(str2);//ABC
         */

        String str1="ABC";
        String str2="ABC";
        String str22="A"+"BC";
        System.out.println(str1==str2);//true 比较地址是否相同，二者相同
        System.out.println(str1==STR);//true
        System.out.println(str1==str22);//true

        //不可复用的形式如下：
        String str33="A";
        str33+="BC";//等价于  str33 = str33 + "BC"；
        String str3= "ABC";
        System.out.println(str1==str33);//false
        System.out.println(str1==str3);//false

    }
}
