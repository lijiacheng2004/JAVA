package practise._15;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: LazySingleton
 * Package: practise._15
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/2/4 16:43
 * @Version 1.0
 */

/**
 * 懒汉式单例实现演示：
 */
public class LazySingleton {
    public static void main(String[] args) {
        LazySingletonDemo.getInstance().工具();
    }
}

/**
 * 懒汉式实现：
 * 目的：不做静态工具方法,不希望外部创建对象,对外提供全局唯一的访问点
 * 1.私有化构造方法
 * 2.声明一个静态的当前类类型的变量用于存储该对象
 * 3.对外提供一个全局的访问点
 */
class LazySingletonDemo{
    private LazySingletonDemo(){}//1.
    private static LazySingletonDemo lazy;//2.
    public static LazySingletonDemo getInstance(){//3.
        if(lazy==null){//如果lazy==null 说明第一次被使用
            return new LazySingletonDemo();//创建对象 并返回
        }
        return lazy;//返回对象
    }
    public void 工具(){
        System.out.println("一个工具执行了...");
    }
}