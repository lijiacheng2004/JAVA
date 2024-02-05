package atljc07._abstract;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Person
 * Package: atljc07._abstract
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/8 23:10
 * @Version 1.0
 */
public abstract class Person {//抽象类：抽象的类不能够实例化
    String name;
    int age;
    public Person(){
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void eat();//抽象方法(没有方法体)
                               //无法调用，用作被重写对象
                               //抽象方法必须出现在抽象类中
    public void sleep(){
        System.out.println("人睡觉");
    }
}
