package atljc07.encapsulation;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Person
 * Package: atljc07.encapsulation
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/2 22:13
 * @Version 1.0
 */
public class Person {
    private int age;
    public void setAge(int a){
        if(a>=0&&a<=130){
            age=a;
        }
        else{
            System.out.println("您输入的数据非法！");
        }
    }
    public int getAge(){
        return age;
    }
}
