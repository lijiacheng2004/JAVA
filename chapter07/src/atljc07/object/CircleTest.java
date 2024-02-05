package atljc07.object;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: CircleTest
 * Package: atljc07.object
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/6 22:50
 * @Version 1.0
 */

//写一个测试类，创建两个Circle对象，判断其颜色是否相等；使用equals()判断其半径是否相等；
//利用toString()方法输出其半径
public class CircleTest {
    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2=new Circle("red",2.0, 2.4);

        System.out.println("颜色是否相等？"+c1.getColor().equals(c2.getColor()));
        //对String类型使用equals(),调用的是String类下的lang包
        //是String类型自己的方法

        System.out.println("半径是否相等？"+c1.equals(c2));
        //调用的Circle类下重写的equals()
    }
}
