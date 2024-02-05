package practise._11;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Demo
 * Package: practise._11
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/30 22:46
 * @Version 1.0
 */

/**
 * 能否强转成功，下面条件二选一：
 *    1.要强转的引用类型变量中的对象，就是要强制转型的类型
 *    2.要强转的引用类型变量中的对象，实现了要转换的这个接口类型
 */
public class Demo {
    public static void main(String[] args) {
        Aoo a1=new Boo();//向上造型
        if(a1 instanceof Boo b1) {//判断a1 是否是Boo这个类型
            System.out.println("a1是Boo这个类型！");
            //强制转型(向下转型),符合条件1
        }
        if(a1 instanceof Inter1 i1) {//判断a1 是否实现了Inter1接口
            System.out.println("a1实现了Inter1接口！");
            //强转，符合条件2
        }
        if(a1 instanceof Coo c1){
            //运行时异常：class cast Exception 类型转换异常
        }
        else{
            System.out.println("a1不是Coo类型！");
        }
    }
}

class Aoo{

}
class Coo extends Aoo{

}
interface Inter1{}

class Boo extends Aoo implements Inter1{

}