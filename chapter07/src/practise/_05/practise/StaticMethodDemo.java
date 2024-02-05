package practise._05.practise;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: StaticMethodDemo
 * Package: practise._05.practise
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/24 23:40
 * @Version 1.0
 */

/**
 * 静态方法的使用演示类：
 */
public class StaticMethodDemo {
    public static void main(String[] args) {
        Coo.test02();//访问静态方法，通过类名打点调用

        new Coo();//效果：先调用静态代码块，再调用构造函数
        new Coo();

        System.out.println(Coo.b);//通过类名访问静态变量

        System.out.println(Coo.C);//通过类名访问常量 在加载类的字节码文件之前进行
        //相当于直接
        //System.out.println(100);
    }
}
class Coo{
    public int a;//实例变量
    public static int b;//静态变量
    public static final int C=100;//常量声明语法 大写！多个单词用下划线隔开

    //常量的适用性：项目中一定不会变的值，设为常量

    Coo(){
        System.out.println("当前Coo这个类的构造方法执行了...");
        a=10;
    }
    static {
        System.out.println("当前Coo这个类静态代码块执行了...");
        b=20;
    }
    //构造方法存在的目的：给实例变量初始化赋值
    //静态代码块存在的目的：给静态变量初始化赋值

    void test(){//普通方法：既可访问实例变量，又可以访问静态变量
        this.a=10;
        Coo.b=20;
    }
    static public void test02(){//静态方法：没有隐式 this 的存在
        //this.a=10;无法访问实例成员(实例变量/普通方法)
        b=20;//只可以访问静态成员
    }
}

