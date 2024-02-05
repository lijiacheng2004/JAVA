package atljc08._interface.JDK8;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: CompareA
 * Package: atljc08._interface.JDK8
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/13 21:00
 * @Version 1.0
 */
public interface CompareA {
    //属性：声明为public static final
    //方法：jdk8之前：只能声明抽象方法

    //方法：jdk8中：静态方法
    static void method1(){
        System.out.println("CompareA:北京");
    }

    //方法：jdk8中：默认方法(default)
    default void method02(){
        System.out.println("CompareA:深圳");
    }

    default void method3(){
        System.out.println("CompareA:广州");
    }
    default void method4(){
        System.out.println("CompareA:上海");
    }
}
