package atljc01._static;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: CircleTest
 * Package: atljc01._static
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/7 12:28
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1=new Circle();
        System.out.println(c1);

        Circle c2=new Circle();
        System.out.println(c2);

        Circle c3=new Circle();
        System.out.println(c3);

        Circle c4=new Circle(2.3);
        System.out.println(c4);

        System.out.println(Circle.total);
        
    }
}
class Circle{
    double radius;
    private final int id;
    static int total;
    public Circle(){//构造器，对Circle类实例化
        this.id=init;
        init++;
        total++;
    }

    public Circle(double radius) {
        this();//用this实例化构造对象
        this.radius = radius;
    }

    private static int init=1001;//自动给id赋值的基数

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", id=" + id +
                '}';
    }
}
