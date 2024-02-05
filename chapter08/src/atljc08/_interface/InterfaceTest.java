package atljc08._interface;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: InterfaceTest
 * Package: atljc08._interface
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/9 22:05
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MIN_SPEED);//用接口直接调用接口里的量

        Bullet b1=new Bullet();
        b1.fly();
        b1.attack();

        //接口的多态性
        Flyable f1=new Bullet();
        f1.fly();
    }
}
interface Flyable{//接口 (接口没有构造器)
    //全局常量
    int MIN_SPEED=0;//public static final为默认，可省略
    int MAX_SPEED=7900;

    //方法:默认为public abstract
    //可以省略public abstract
    void fly();
}
interface Attackable{//接口
    void attack();
}

abstract class Plane implements Flyable{//用类实现接口

}
class Bullet implements Flyable,Attackable{
    //对于Flyable与Attackable而言，Bullet叫做实现类
    //一个类可以接多个接口;多实现，弥补了单继承的局限性
    @Override
    public void fly() {
        System.out.println("让子弹飞一会");
    }
    @Override
    public void attack() {
        System.out.println("子弹可以击穿身体");
    }
}

//测试接口的继承关系
interface AA{
    void method1();
}
interface BB{
    void method2();
}
interface CC extends AA,BB{
    //接口可以多继承
    //CC：子接口，AA BB：父接口

}
class DD implements CC{//DD是AA BB CC的实现类
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}



