package atljc03.extend;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: ExtendsTest
 * Package: atljc03_extend
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/4 22:25
 * @Version 1.0
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Tom";
        s1.eat();

        Person p1=new Person();
        System.out.println(p1);

        System.out.println(s1.getClass().getSuperclass());
        System.out.println(p1.getClass().getSuperclass());
    }
}
class Person{
    String name;
    int age;
    public void eat(){
        System.out.println("人吃饭");
    }
    public void sleep(){
        System.out.println("人睡觉");
    }
}
class Student extends Person{
    String school;
    public void study(){
        System.out.println("学生学习");
    }
}
