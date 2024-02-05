package atljc05.method_more;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: PassObject
 * Package: atljc05.method_more
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/1 23:15
 * @Version 1.0
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject obj=new PassObject();
        Circle circle=new Circle();

        obj.printAreas(circle, 5);

        System.out.println("now radius is:"+circle.radius);
    }
    public void printAreas(Circle c,int time){
        System.out.println("Radius\t\tArea");

        int i=1;
        for(;i<=time;i++){
            c.radius=i;
            System.out.println(c.radius+"\t\t"+c.findArea());
        }
        c.radius=i;
    }

}
