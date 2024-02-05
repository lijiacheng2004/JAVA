package atljc01_this;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: PersonTest
 * Package: atljc01_this
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/4 18:25
 * @Version 1.0
 */
//this:相当于对象自己的名
//1.this 调用属性或方法（非static修饰的方法）
//2.this 调用构造器 ：可以this(形参列表)调用当前类中的非己其他构造器
public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setAge(10);
        System.out.println(p1.age);

        Person p2=new Person("Tom",12);
    }
}
class Person{
    String name;
    int age;
    int number;
    public Person(){
    }
    public void setAge(int age){//尽量在必要的时候用this，不必要时省略
        this.age=age;
    }
    public Person(String name,int age){
        this();//构造器里可以调用构造器，但必须声明在最前面
        this.age=age;
        this.name=name;
    }
    public Person(int number){
        this("Tom",12);//构造器里可以调用构造器，但必须声明在最前面
        this.number=number;
    }

}
