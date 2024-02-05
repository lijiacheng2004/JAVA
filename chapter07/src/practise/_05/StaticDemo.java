package practise._05;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: StaticDemo
 * Package: practise._05
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/24 17:50
 * @Version 1.0
 */

/*
   实例变量：属于对象的，有多少个对象就有多少份，在堆区中存储，访问则通过对象来访问
   静态变量：属于类的，且只有一份，被所有对象共享，在方法区中存储，访问则通过类名访问

   静态变量目的：让对象共享该资源
 */
public class StaticDemo {
    public static void main(String[] args) {
        Boo b1=new Boo();
        b1.show();
        Boo b2=new Boo();
        b2.show();
        Boo b3=new Boo();
        b3.show();
        System.out.println(Boo.b);//静态变量，通过类名打点调用
    }
}
class Boo{
    public int a;//实例变量
    public static int b;//静态变量
    Boo(){
        a++;
        b++;
    }
    public void show(){
        System.out.println("实例变量a的值是："+a+"，静态变量b的值是"+b);
    }
}

class A{
    static {System.out.println("静态代码块");}
    int a=10;
    public A(){System.out.println("A");}
    void eat(){System.out.println("a");}
}

class B extends A{
    int b=10;
    public B(){System.out.println("B");}
    void eat(){System.out.println("b");}
}

class C{
    public static void main(String[] args) {
        A b=new B();
        b.eat();
    }
}

//栈区：局部变量
//堆区：对象
//方法区：类
