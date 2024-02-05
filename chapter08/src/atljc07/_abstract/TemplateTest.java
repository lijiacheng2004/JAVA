package atljc07._abstract;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: TemplateTest
 * Package: atljc07._abstract
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/8 23:30
 * @Version 1.0
 */
public class TemplateTest {
    public static void main(String[] args) {
        PrintPrimeNumber p=new PrintPrimeNumber();

        p.spendTime();
    }
}
abstract class  Template{
    public void spendTime(){
        long start=System.currentTimeMillis();

        code();

        long end=System.currentTimeMillis();

        System.out.println("花费的时间："+(end-start));

    }
    public abstract void code();
}

class PrintPrimeNumber extends Template{
    @Override//重写
    //此算法:找到2~100000中所有的质数
    public void code() {
        for(int i=2;i<=100000;i++){
            boolean isFlag=true;
            for(int j=2;j<Math.sqrt(i);j++){
                if(i%j==0){
                    isFlag=false;
                    break;
                }
            }
            if(isFlag){
                System.out.println(i);
            }
        }
    }
}
