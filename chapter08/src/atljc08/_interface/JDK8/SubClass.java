package atljc08._interface.JDK8;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: SubClass
 * Package: atljc08._interface.JDK8
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/13 21:05
 * @Version 1.0
 */
public class SubClass extends SuperClass implements CompareA,CompareB{
    @Override
    public void method02() {
        System.out.println("Subclass:深圳");
    }

    //
    public void method3(){
        System.out.println("CompareA:广州");
    }

    public void method4(){
        System.out.println("SubClass:上海");
    }

    public void method(){
        //知识点5：如何在子类（或实现类）中调用父类被重写的方法
        method4();//调用自己类中的方法

        super.method4();//调用父类中的方法

        method3();//调用自己类中的方法

        CompareA.super.method3();//调用CompareA中的默认方法
        CompareB.super.method3();//调用CompareB中的默认方法
    }

}
