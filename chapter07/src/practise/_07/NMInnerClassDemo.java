package practise._07;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: NMInnerClassDemo
 * Package: practise._07
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/28 14:27
 * @Version 1.0
 */

/**
 * 匿名内部类：没有名字的内部类
 *
 * 适用性：当一个子类，仅仅是为了重写父类中的某个方法，其他地方不需要使用这个子类
 * 那么可以使用匿名内部类的方式来简化程序编写,可以面向逻辑编程，忽略固定语法实现
 */
/**
 * 匿名内部类的测试类：
 */
public class NMInnerClassDemo {
    public static void main(String[] args) {
        //SuperClass sc=new SubClass();
        //sc.show();

        //匿名内部类的使用：
        //1.创建匿名内部类，该内部类是SuperClass的子类
        //2.创建该匿名内部类的对象，将对象赋值给sub
        //3.该花括号，则是匿名内部类的类体，乐意在该类体重实现重写，完成逻辑代码
        SuperClass sub=new SuperClass() {//该行创建的匿名内部类的外部类是？  NMInnerClassDemo
                                         //该匿名内部类的父类是谁？         SuperCLass
            @Override
            public void show() {
                System.out.println("通过匿名内部类的方式，创建SubClass子类，并实现重写");
            }
        };
        sub.show();//调用父，执行子
    }
}

abstract class SuperClass{//父类
    public abstract void show();

}
//目的重写实现show方法
//代码实现：1.创建一个子类 2.实现继承 3.重写show()
class SubClass extends SuperClass{
    @Override
    public void show() {
        System.out.println("SubClass重写了父类的show方法...");
    }
}
//面试题：成员内部类/匿名内部类有没有.class字节码文件？
//答:都有.class字节码文件

