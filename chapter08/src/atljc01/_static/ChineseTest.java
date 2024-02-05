package atljc01._static;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: ChnineseTest
 * Package: atljc01._static
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/6 23:30
 * @Version 1.0
 */
public class ChineseTest {
    public static void main(String[] args) {

        Chinese.show();//静态方法由类直接调用,也可由实例化对象调用
                       //非静态方法只能由实例化对象调用

                       //static修饰的方法内，不能使用this和super（this与super相当于实例化对象）

        System.out.println(Chinese.nation);//静态变量可由类直接调用，也可由实例对象调用
                                           //非静态变量只能由实例化对象调用

        Chinese c1=new Chinese();
        c1.age=40;
        Chinese.nation ="China";

        Chinese c2=new Chinese();
        c2.name="刘翔";
        c2.age=39;

        //输出人物的信息
        System.out.println(c1);//println()中调用了toString()
        System.out.println(c2);

        System.out.println(Chinese.nation);//共用一个 nation
        System.out.println(Chinese.nation);//都是 China
    }
}
class Chinese{
    //非静态变量、实例变量
    String name;
    int age;
    //静态变量
    static String nation;

    public static void show(){
        System.out.println("我是一个中国人");
        //静态方法内不可以调用非静态结构
    }

    @Override
    public String toString() {//toString()打印类中属性
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}