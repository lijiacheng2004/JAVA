package atljc06.polymorphism;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Women
 * Package: atljc06.polymorphism
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/5 11:56
 * @Version 1.0
 */
public class Women extends Person{
    boolean isBeauty;
    public void est(){
        System.out.println("女人应该少吃");
    }
    public void sleep(){
        System.out.println("女人窈窕走路");
    }
    public void goShopping(){
        System.out.println("女人喜欢逛街");
    }
}
