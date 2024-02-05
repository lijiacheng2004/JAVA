package practise._01;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Stundent
 * Package: practise._01
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/18 12:49
 * @Version 1.0
 */
/*
   向上造型
   前提：有继承关系
   语法：声明父类 new子对象 的语法，就是向上造型的语法
            接口 new 实现类
   造的对象只能使用父类的变量，无法使用子类 独有 的变量/方法
 */
public class Demo01 {
    public static void main(String[] args) {
    //  声明类型      创建变量
        People p=new People();  //人 是 人     语义同----程序不会报错
        Student s=new Student();//学生 是 学生  语义同

//向上造型：
        People p1=new Student();//学生 是 人    语义通

      //Student s1=new People(); 报错！！语义不通
    }
}
class People {

}
class Student extends People{

}

