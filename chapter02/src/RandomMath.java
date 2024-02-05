/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: RandomMath
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/10/23 19:42
 * @Version 1.0
 */

//random随机数，范围：[0.0,1.0)
public class RandomMath {
    public static void main(String[] args) {
        double d1= Math.random();

        System.out.println("d1="+d1);

        int num1=(int)(Math.random()*101);//[0.0,1.0)-->[1,100)

    }
}
