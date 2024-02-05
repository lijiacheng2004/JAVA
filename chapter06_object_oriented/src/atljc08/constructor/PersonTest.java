package atljc08.constructor;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: PersonTest
 * Package: atljc08.constructor
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/2 23:37
 * @Version 1.0
**/
//constructor:构造器(构造函数)
public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person();//默认构造
        Person p2=new Person(10);//含参构造
    }
}
