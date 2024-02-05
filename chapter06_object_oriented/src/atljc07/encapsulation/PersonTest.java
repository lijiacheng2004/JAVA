package atljc07.encapsulation;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: PersonTset
 * Package: atljc07.encapsulation
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/2 22:16
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setAge(10);
        System.out.println("年龄是："+p1.getAge());
    }
}
