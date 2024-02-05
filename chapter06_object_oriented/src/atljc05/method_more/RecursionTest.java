package atljc05.method_more;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: RecursionTest
 * Package: atljc05.method_more
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/2 20:14
 * @Version 1.0
 */
public class RecursionTest {//递归

    public static void main(String[] args) {
        RecursionTest test=new RecursionTest();

        System.out.println(test.getSum(100));
        System.out.println(test.getSum1(100));
        System.out.println(test.getMul(4));
    }
    //举例1：计算1~100内自然数的和
    public int getSum(int num){//迭代方法
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        return sum;
    }
    public int getSum1(int num){//递归方法
        if(num==1){
            return 1;
        }
        else{
            return getSum1(num-1)+num;
        }
    }
    public int getMul(int num){//递归算n的阶乘
        if(num==1){
            return 1;
        }
        else{
            return getMul(num-1)*num;
        }
    }
}
