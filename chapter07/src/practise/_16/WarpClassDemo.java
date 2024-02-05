package practise._16;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: WarpClassDemo
 * Package: practise._16
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/2/4 17:38
 * @Version 1.0
 */

/**
 * 包装类：
 */
public class WarpClassDemo {
    public static void main(String[] args) {
        /** 基本数据类型          包装类类型
         *  byte                Byte
         *  short               Short
         *  int                 Integer
         *  long                Long
         *  float               Float
         *  double              Double
         *  char                Character
         *  boolean             Boolean
         */


//       1. 将基本数据类型转化为包装类类型
        int number=100;
//        Integer i1 = new Integer(number);
//        Integer i2 = new Integer(number);
//        System.out.println(i1 == i2);//false

        Integer i1=Integer.valueOf(number);//Integer提供的静态valueOf 有缓存机制 1个字节的内容
        Integer i2=Integer.valueOf(number);//Integer比较特殊 -128~127 区间的数 会缓存 相同值的对象地址会相同
        System.out.println(i1);//100 重写了toString 方法
        System.out.println(i1 == i2);//true 地址相同
        System.out.println(i1.equals(i2));//true 值相同
        Integer i3=Integer.valueOf("123");//支持传入String内容,但是String内容必须是数值才行
        System.out.println(i3);
        int n1=Integer.parseInt("100");//parseInt 将传入的字符串转换为具体数值类型
        System.out.println(n1);

        double d=3.14;
        Double d1=Double.valueOf(d);//将传入的基本数据类型double转换为包装类Double存储
        Double d2=Double.valueOf(d);
        System.out.println(d1 == d2);//false 比较地址 地址不同
        System.out.println(d1.equals(d2));//true 比较值 值相同
        double n2=Double.parseDouble("100.11");//parseDouble 将字符串转化为小数
        System.out.println(n2);//100.11

//       2.将包装类类型 转化为 基本数据类型
        Integer i4=Integer.valueOf(200);
        int n3=i4.intValue();
        System.out.println(n3);

        Double d3=Double.valueOf(3.14);
        double n4=d3.doubleValue();
        System.out.println(n4);

        System.out.println(Integer.MAX_VALUE);//获取int最大值
        System.out.println(Integer.MIN_VALUE);//获取int最小值

        int i=255;
        System.out.println(Integer.toBinaryString(i));//将传入的10进制转换为2进制
        System.out.println(Integer.toOctalString(i));//将传入的10进制转换为8进制
        System.out.println(Integer.toHexString(i));//将传入的10进制转换为16进制

        /*自动拆装箱
        Jdk1.5版本后,推出新特性,自动拆装箱，编译器遇到基本数据类型与对应包装类类型互相赋值时,
        会自动帮我们完成转换的工作,
        这个特性只是编译器认可,实际上并不存在直接互相赋值的操作。
         */
        //自动拆装箱
        //装箱:指的是将基本数据类型 赋值 给 包装类 类型
        /** Integer i1 = 100;
         * 实际上:   Integer i1 = Integer.valueOf(100);
         */
        Integer i5 = 100;
        System.out.println(i5);
        //拆箱:将包装类 类型 赋值 给 基本数据类型
        /** int i2 = i1;
         *  实际上: int i2  = i1.intValue();
         */
        int i6 = i5;
        System.out.println(i6);
    }
}
