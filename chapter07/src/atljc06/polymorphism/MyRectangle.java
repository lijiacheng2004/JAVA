package atljc06.polymorphism;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: MyRectangle
 * Package: atljc06.polymorphism
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/5 21:29
 * @Version 1.0
 */
public class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override//方法的重写
    public double findArea() {
        return width*height;
    }
}
