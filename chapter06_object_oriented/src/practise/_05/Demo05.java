package practise._05;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Demo05
 * Package: practise._05
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/17 0:39
 * @Version 1.0
 */
//打印水仙花数
//水仙花数：一个三位数，其各个数字立方和等于该数本身
//eg:153=1*1*1+5*5*5+3*3*3
public class Demo05 {
    public static void main(String[] args) {
        int temp;
        int a,b,c;
        for(int i=100;i<=999;i++){
            a=i/100;
            b=i/10%10;
            c=i%10;
            temp=a*a*a+b*b*b+c*c*c;
            if(i==temp) System.out.println(i);
        }
    }
}
