package atljc05.method_more;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: ValueTransferTest1
 * Package: atljc05.method_more
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/1 21:35
 * @Version 1.0
 */
public class ValueTransferTest1 {
    public static void main(String[] args) {
        ValueTransferTest1 test=new ValueTransferTest1();

        int m=10;
        test.method1(m);

        System.out.println("m="+m);//输出10
        //main函数与method函数分别在栈区开辟，里面各有一个int m;
        //在method中的m为11，main中的仍为10

        Person1 p=new Person1();
        p.age=10;

        test.method2(p);

        System.out.println(p.age);//11
        //p传入method2后，对堆区的p进行了操作
    }
    public void method1(int m){
        m++;
    }
    public void method2(Person1 p){
        p.age++;
    }
}
class Person1{
    int age=0;
}