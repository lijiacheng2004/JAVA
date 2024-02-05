package atljc10._enum.exer1;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: BankTest1
 * Package: atljc10._enum.exer
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/19 16:48
 * @Version 1.0
 */
public class BankTest1 {
}
//jdk5.0之前使用枚举类定义单例模式
class Bank1{
    private Bank1(){}
    public static final Bank1 instance=new Bank1();

}

enum Bank2{
    CPB
}

//jdk5.0使用enum关键字定义枚举类的方式定义单例模式
enum GirlFriend{
    XIAO_LI(20);
    private final int age;
    GirlFriend(int age){
        this.age=age;
    }
}
