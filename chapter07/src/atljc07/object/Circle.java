package atljc07.object;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Circle
 * Package: atljc07.object
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/6 21:21
 * @Version 1.0
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
        color="white";
        weight=1.0;
        radius=1.0;
    }

    public Circle(double radius) {
        color="white";
        weight=1.0;
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //求圆的面积
    public double findArea(){
        return Math.PI*radius*radius;
    }

    //重写equals()方法，比较两个圆的半径是否相等
    public boolean equals(Object obj){//多态的使用
        if(this==obj){
            return true;//地址都相同，是同一个new出的对象,那么半径一定相同
        }
        if(obj instanceof Circle c){//判断obj与Circle是否同类，或obj是否为Circle的父类
            //向下转型
            return this.radius==c.radius;
        }
        return false;
    }

    //重写toString()
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
