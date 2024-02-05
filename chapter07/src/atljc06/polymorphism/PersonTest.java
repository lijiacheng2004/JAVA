package atljc06.polymorphism;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: PersonTest
 * Package: atljc06.polymorphism
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/5 11:59
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        //一般情况
        Person p1=new Person();
        Man m1=new Man();
        //多态性             //多态（向上转型）（将Man型转为Person型）
        Person p2=new Man();//创建父类对象时可以调用子类的构造器
                            //只能调用“Man中的”与Person同名的方法，Man中特有的方法不能调用
                            //属性不满足多态性：类属性与多态性没关系
        p2.eat();//调用方法时：编译看左边，运行看右边

        //多态使用的前提:1.有类的继承关系 2.有方法的重写

        //多态性的好处：极大减少了代码的冗余，不需要定义多个重载的方法
    }
}
