package atljc08.constructor;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Person
 * Package: atljc08.constructor
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/2 23:35
 * @Version 1.0
 */
public class Person {
    String name;
    int age;
    public Person(){//默认构造器(相当于C++中默认构造函数)
        System.out.println("Person()....");
    }
    public Person(int a){//其他的构造器
        age=a;
    }//若你在类中写出了构造器，默认构造器Person()将不会自动提供

}
