package practise._07;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: MemberInnerClassDemo
 * Package: practise._07
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/27 19:47
 * @Version 1.0
 */

/**
 * 成员内部类的测试:
 */
public class MemberInnerClassDemo {
    public static void main(String[] args) {
//        Boo b1=new Boo(); 1.内部类对外不具备可访问性
        Aoo a1=new Aoo();
        a1.test();
    }
}

class Aoo{//外部类
    private int a;
    void test(){
        Boo b1=new Boo();//内部类可以在外部类中访问
        b1.test01();
        System.out.println(b1.a);
    }
    class Boo{//内部类
        int a;
        void test01(){
            // 2.内部类共享外部类的内容
            this.a=10;//内部类的 a
            Aoo.this.a=20;//外部类的 a
//            test();
        }
    }
}

