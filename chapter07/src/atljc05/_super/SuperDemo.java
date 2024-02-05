package atljc05._super;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: SuperDemo
 * Package: atljc05._super
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/18 13:20
 * @Version 1.0
 */
/*
   super 关键字的演示：
   super代表 父类，在哪个类中使用super 该super就表示这个类的父类

   super():  调用父类默认无参构造方法
   super.变量 调用父类中的全局变量(应用率极低！)
   super.方法 指的是父类中的某个方法
*/
public class SuperDemo {
    public static void main(String[] args) {
        /*
           如果实现了继承，当子类被创建对象时，
   子类的构造方法会先去执行父类的构造方法的内容，再执行自己的构造方法内容

   现象：在子类的构造方法中默认有一个写法：super():表示调用父类无参构造方法
         */
        Boo b=new Boo();
        /*
           如果父类只添加了有参构造方法，而没有写无参构造方法，子类一旦实现继承则会报错
         */
    }
}
class Aoo{//父类 /超类（super）
    Aoo(){
        System.out.println("Aoo类的无参构造方法执行了。。。");
    }
    Aoo(int a){
        System.out.println("Aoo类的有参构造方法执行了。。。");
    }
}
class Boo extends Aoo{//子类 /派生类
    Boo(){
        super();
        System.out.println("Boo类的构造方法执行了。。。");
    }

}

