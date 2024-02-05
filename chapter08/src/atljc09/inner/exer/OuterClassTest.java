package atljc09.inner.exer;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: OuterClassTest
 * Package: atljc09.inner.exer
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/15 22:17
 * @Version 1.0
 */
public class OuterClassTest {
    public static void main(String[] args) {
        //1.创建Person的静态的成员内部类的实例
        Person.Dog dog=new Person.Dog();
        dog.eat();

        //2.创建Person的非静态的成员内部类的实例
        //需要先实例化Person对象

        Person p1=new Person();
        Person.Bird bird=p1.new Bird();
                       //new p1.Bird() 是错的
        bird.eat();
        bird.show("黄鹂");
        bird.show1();
    }
}
class Person{
    int age=10;
    String name="TOM";
    static class Dog{
        public void eat(){
            System.out.println("狗吃骨头");
        }
    }
    class Bird{
        String name="啄木鸟";
        public void eat(){
            System.out.println("鸟觅食");
        }
        public void show(String name){
            System.out.println("age="+age);
            System.out.println("name="+name);
            System.out.println("name="+this.name);
            System.out.println("name="+Person.this.name);
        }
        public void show1(){
            eat();//鸟觅食
            this.eat();//鸟觅食
            Person.this.eat();//人吃饭
        }
    }
    public void eat(){
        System.out.println("人吃饭");
    }
    public void method(){
        class InnerClass1{

        }
    }
    public Person(){
        class InnerClass2{

        }
    }
    {
        class InnerClass2{

        }
    }
}
