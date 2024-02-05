package atljc07.object;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: GeometricObject
 * Package: atljc07.object
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/6 21:18
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject() {
        color="white";
        weight=1.0;
    }

    public GeometricObject(String color, double weight) {
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
}
