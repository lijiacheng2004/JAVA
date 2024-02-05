package atljc08._interface.JDK8;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: SubClassTset
 * Package: atljc08._interface.JDK8
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/13 21:06
 * @Version 1.0
 */
public class SubClassTest {
    public static void main(String[] args) {
        //知识点1：接口中声明的静态方法只能被接口来调用，不能试用其实现类进行调用
        //这一点与类有所不同
        CompareA.method1();

        //知识点2：接口中声明的默认方法可以被实现类继承，实现类在没有重写此方法的情况下
        //默认调用接口中声明的默认方法，如果实现类重写了此方法，则调用重写的方法
        SubClass s1=new SubClass();
        s1.method02();

        //知识点3：类实现了两个接口，而两个接口中定义了同名同参数的默认方法，
        //则实现类在没有重写此两个接口默认方法的情况下，会报错。---->接口冲突
        //要求：此时实现类必须要重写接口中定义的同名同参数的方法
        s1.method3();

        //知识点4：类优先原则：
        //继承的类与接口有同名同参数的方法，优先调用父类中的方法
        s1.method4();
    }
}
