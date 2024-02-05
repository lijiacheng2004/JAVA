package practise._03;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Demo03
 * Package: practise._03
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/16 13:00
 * @Version 1.0
 */
public class Demo03 {
    public static void main(String[] args) {

        int result=operation(1,2,'+');
        System.out.println(result);
    }
    static int operation(int a,int b,char c){
        if (c=='+')return a+b;
        if (c=='-')return a-b;
        if (c=='*')return a*b;
        if (c=='/')return a/b;
        else {
            System.out.println("输入的操作数不合规");
            return -1;
        }
    }
}
