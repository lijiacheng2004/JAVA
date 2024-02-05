package atljc11.annotation;

import java.util.Date;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: AnnotationTest
 * Package: atljc11.annotation
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/19 23:45
 * @Version 1.0
 */
public class AnnotationTest {
    public static void main(String[] args) {
        Person p1=new Student();
        p1.walk();

        Date date=new Date();
        System.out.println(date);

        Date date1=new Date(2023,11,19);//这个重载的不建议再去用了

        Person p2=new Person();
        Person p3=new Person("李华");

        System.out.println(p3);

        int num=10;
    }
}
class Person{
    String name;

    public Person() {
    }
    @Deprecated
    public Person(String name){
        this.name=name;
    }//加了Deprecated说明此构造器不建议再使用，若使用，则会出现黄线提示

    public void eat(){
        System.out.println("人吃饭");
    }
    public void walk(){
        System.out.println("人走路");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Student extends Person{
    @Override
    public void eat() {
        System.out.println("学会吃饭");
    }

    @Override
    public void walk() {
        System.out.println("学生走路");
    }
}
