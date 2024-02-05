package atljc12.wrapper;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: WrapperTest
 * Package: atljc12.wrapper
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/20 20:10
 * @Version 1.0
 */
public class WrapperTest {
    /*
    基本数据类型---->包装类：1.使用包装类的构造器2.(建议)调用包装类的valueOf(xxx xx)
    包装类---->基本数据类型 调用包装类的xxxValue()

    jdk5.0 新特性：自动装箱，自动拆箱，很常用
    */
    public static void main(String[] args) {
        WrapperTest test1=new WrapperTest();
        test1.test1();
        test1.test3();
    }
    public void test1() {
        int i1 = 10;
        Integer ii1 = i1;//自动装箱
        System.out.println(ii1);

        Integer ii2=i1+1;//自动装箱

        int i2=ii2;//自动拆箱
        System.out.println(i2);

        float f1 = 12.3F;
        Float ff1 = f1;
        System.out.println(ff1);

        //推荐使用：
        int i3=10;
        Integer ii3=Integer.valueOf(i3);

        Boolean b2=Boolean.valueOf(true);

        Float f2=Float.valueOf(12.3F);

        System.out.println(f2.floatValue()+"=");//调用包装类的xxxValue()
    }
    public void  test3(){
        Account account=new Account();
        System.out.println(account.isFlag1);//false
        System.out.println(account.isFlag2);//null
    }
}
class Account{
    boolean isFlag1;
    Boolean isFlag2;
}


