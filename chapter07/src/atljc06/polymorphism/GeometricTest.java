package atljc06.polymorphism;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: GeometricTest
 * Package: atljc06.polymorphism
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/5 21:32
 * @Version 1.0
 */

public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test=new GeometricTest();

        Circle c1=new Circle("red", 1.0, 2.3);
        Circle c2=new Circle("red", 1.0, 3.3);

        test.displayGeometricObject(c1);
        test.displayGeometricObject(c2);

        boolean isEquals=test.equalsArea(c1, c2);
        if(isEquals){
            System.out.println("面积相等");
        }
        else{
            System.out.println("面积不相等");
        }


    }
    //1.比较两个几何图形的面积是否相等
    //if true,则相等；false,则不相等
    public boolean equalsArea(GeometricObject g1,GeometricObject g2){
        return g1.findArea() == g2.findArea();
    }

    //显示几何图形的面                                       //多态：下面两行
    public void displayGeometricObject(GeometricObject g){//GeometricObject g=new Circle("red",1.0 , 2.3);
                                                          //GeometricObject g=new Circle("red", 1.0, 3.3);
        System.out.println("几何图形的面积为："+g.findArea());//这种编译运行时有多个子类的方法选择，需要确定对象类型才能确定的情况
                                                           //叫动态绑定（与之对应有<--->静态绑定）
    }
}
