package atljc06.polymorphism;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: GeometricObject
 * Package: atljc06.polymorphism
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/5 21:20
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;
    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double findArea(){
        return 0.0;
    }
}
