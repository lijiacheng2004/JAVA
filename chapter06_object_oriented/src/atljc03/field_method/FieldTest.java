package atljc03.field_method;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: FieldTest
 * Package: atljc03.field_method
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/10/25 22:40
 * @Version 1.0
 */
public class FieldTest {

}
//属性（类中的成员变量）：随着对象的创建，存储于堆空间
//局部变量：储存于栈空间
class Person{
    String name;//成员变量
    int age;
    char gender;
    public void eat(){
        String food="宫保鸡丁";//局部变量
        System.out.println("我喜欢吃"+food);
    }
    public void sleep(int hour){//局部变量
        System.out.println("睡了"+hour+"小时");
    }
}
