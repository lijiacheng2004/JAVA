package atljc01._static.opp;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: PhoneTest
 * Package: atljc01.opp
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/10/25 0:13
 * @Version 1.0
 */

//1.对象在内存中的分配涉及到的内存结构（理论）
//栈(stack):方法（函数）内定义的变量，储存在栈（如p1）
//堆(heap):new 出来的结构（如：数组实体（array）、对象实体（Phone）、对象的属性（成员变量）（p1.name））
//方法区（method area）:存放类的模版。（Person类的模版）

//2.局部变量、成员变量（见程序Phone）

//3.权限修饰符：public、private、protected
public class PhoneTest {
    public static void main(String[] args) {

        Phone p1=new Phone();

        p1.name="huawei mate60pro";
        p1.price=8999;
        System.out.println("name="+p1.name+",price="+p1.price);

        p1.call();

    }
}
