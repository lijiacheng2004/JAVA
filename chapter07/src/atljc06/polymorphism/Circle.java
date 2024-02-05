package atljc06.polymorphism;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Circle
 * Package: atljc06.polymorphism
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/5 21:25
 * @Version 1.0
 */
public class Circle extends GeometricObject{
    private double radius;

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

    @Override
    public double findArea() {
        return Math.PI*radius*radius;
    }
}
