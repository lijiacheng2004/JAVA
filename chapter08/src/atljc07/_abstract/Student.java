package atljc07._abstract;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Student
 * Package: atljc07._abstract
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/8 23:12
 * @Version 1.0
 */
public class Student extends Person{
    String school;

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
    public void eat(){
        System.out.println("学生吃饭");
    }
    public void sleep(){
        System.out.println("学生睡觉");
    }
}
