package practise._15;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: HungrySingleton
 * Package: practise._15
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/2/4 16:16
 * @Version 1.0
 */

/**
 * 饿汉式单例的使用演示类：
 */
public class HungrySingleton {
    public static void main(String[] args) {
//        HungrySingletonDemo h=new HungrySingletonDemo();
//        h.工具();
        HungrySingletonDemo hungry1=HungrySingletonDemo.getInstance();
        HungrySingletonDemo hungry2=HungrySingletonDemo.getInstance();
        System.out.println(hungry1 == hungry2);//true 说明地址相同
                                               // hungry1 hungry2 指向的是同一个对象
        HungrySingletonDemo.getInstance().工具();
    }
}

/**
 * 饿汉式单例实现：
 * 目的:不做静态工具方法 不希望外部创建对象 对外提供全局唯一的访问点
 * 1.私有化构造方法，防止外部创建对象
 * 2.在类中给自己创建对象
 * 3.对外提供用户获取当前类对象的静态方法
 *
 * 饿汉式：在外部调用类名之前 就在类内创建好对象
 */
class HungrySingletonDemo{
    private HungrySingletonDemo(){}//将构造私有 防止类外构造
    private static final HungrySingletonDemo hungry=new HungrySingletonDemo();//创建对象 (私有)
    public static HungrySingletonDemo getInstance(){//对外提供获取类实例的方法
        return hungry;
    }
    public void 工具(){
        System.out.println("工具方法执行了...");
    }
}
