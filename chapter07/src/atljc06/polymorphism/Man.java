package atljc06.polymorphism;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Man
 * Package: atljc06.polymorphism
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/5 11:53
 * @Version 1.0
 */
public class Man extends Person{
    boolean isSmoking;
    public void eat(){
        System.out.println("男人多吃肉");
    }
    public void sleep(){
        System.out.println("男人笔挺走路");
    }
    public void earnMoney(){
        System.out.println("男人挣钱养家");
    }
}
