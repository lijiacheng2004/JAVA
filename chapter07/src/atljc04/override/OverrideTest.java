package atljc04.override;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: OverrideTest
 * Package: atljc04.override
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/4 23:35
 * @Version 1.0
 */
//继承时的重写：
//1.父类被重写的方法与子类重写的方法的方法名和形参列表必须相同
//2.子类重写的方法权限修饰符大于等于父类
//3.子类重写方法的返回值类型要小于等于父类
//问题：重载与重写的区别？
   //重载：方法名相同，在同一个类里，形参不同
   //重写：在继承中，方法名相同，形参相同，内容不同
public class OverrideTest {

}
class Person{
    void eat(){
        System.out.println("人好！");
    }
}
class Student extends Person{
    @Override
    void eat() {
        System.out.println("学生好！");
    }
}
