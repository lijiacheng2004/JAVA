package atljc09.bean_uml;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: UserTest
 * Package: atljc09.bean_uml
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/2 23:48
 * @Version 1.0
 */
//属性赋值过程
//1.默认赋值 2.显式赋值 3.构造器赋值 4.5.对象.方法/对象.属性赋值
public class UserTest {
    public static void main(String[] args) {
        User u1=new User();
        System.out.println(u1.age);

        User u2=new User(2);
        System.out.println(u2.age);//2
    }
}
class User{
    //属性(实例变量)
    String name;
    int age=1;//默认值为零,现在显式赋值为1
    public User(){

    }
    public User(int a){
        age=a;
    }
}