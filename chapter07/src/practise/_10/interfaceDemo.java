package practise._10;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: interfaceDemo
 * Package: practise._10
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/30 17:08
 * @Version 1.0
 */

/**
 * 接口语法的测试类：
 */
public class interfaceDemo {
    public static void main(String[] args) {
        Inter1 i1=new Aoo();//向上造型
        i1.show();//调用父执行子
    }
}

/** 关系：
 *   类 与 类  ---继承关系 ---单继承
 *   接口与接口 ---继承关系 ---多继承
 *   接口与类  ---实现关系
 *
 */
interface Inter1{//接口的定义
    //常量与抽象方法
    int A=10;//默认为常量
    void show();//默认为抽象方法 abstract
}
interface Inter2{
    void test1();
}
interface Inter3{
    void test2();
}
interface Inter4 extends Inter2,Inter3{//多继承

}
class SuperClass{//父类

}
class Aoo extends SuperClass implements Inter1,Inter4{//先继承 后接口实现
    @Override
    public void show() {
        System.out.println("实现Inter1 show的重写！");
    }

    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }
}

