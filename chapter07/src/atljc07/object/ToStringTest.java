package atljc07.object;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: ToStringTest
 * Package: atljc07.object
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/6 20:40
 * @Version 1.0
 */
public class ToStringTest {
    public static void main(String[] args) {
        User u1=new User("Tom",12);
        System.out.println(u1);//atljc07.object.User@3b07d329
        System.out.println(u1);//atljc07.object.User@3b07d329
                               //都得到了 包名、类名、@地址值
                               //说明在使用printin()时，间接也调用了toString();

        String s1= "hello";
        System.out.println(s1);//输出hello
        //说明自定义类，在没重写toString时，默认返回地址值
        //像String、File、Date或包装类等Object的子类，都重写了，在调用toString()时，
        //返回当前对象的实体内容

        //在实际开发中，需要重写我们自定义的toString()
    }
}
class User{
    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //手动实现toString()
    /*
    @Override
    public String toString() {
        return "User{name="+name+",age="+age+"}";
    }
    */

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

