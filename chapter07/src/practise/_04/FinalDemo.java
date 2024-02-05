package practise._04;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: FinalDemo
 * Package: practise._04
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/24 17:26
 * @Version 1.0
 */

/*
   final
   1.修饰变量：用final修输的属性，不可二次更改，且声明时必须初始化
   2.修饰方法：用final修饰的方法，不能被重写 ---存在于父类代码中
   3.修饰类： 用final修饰的类，不能被继承 ---在功能类中
 */
public class FinalDemo {
    public final int a=100;//final修饰变量 需要声明时初始化
    void test(){
        System.out.println(a);
        //a=200;final修饰的变量不可二次修改！
    }
}

final class Aoo{//被final修饰的类，不能被继承
    private void show(){//final修饰的方法，无法被重写

    }
}

//class Boo extends Aoo {
    //@Override
    //protected void show() {
    //}
//}
