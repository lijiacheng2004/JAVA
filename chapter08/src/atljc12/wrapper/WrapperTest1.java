package atljc12.wrapper;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: WrapperTest1
 * Package: atljc12.wrapper
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/20 21:41
 * @Version 1.0
 */
public class WrapperTest1 {
    public static void main(String[] args) {
        WrapperTest1 test=new WrapperTest1();
        test.test1();
        test.test2();
    }
    /*
    基本数据类型、包装类---> String类型:1.调用String的重载的静态方法valueOf(xxx xx)
                                    2.基本数据类型的变量+“”


    String类型--->基本数据类型、包装类
    */
    public void test1(){
        //方式1：
        // 调用String的重载的静态方法valueOf(xxx xx)
        int i1=10;
        String str1=String.valueOf(i1);
        System.out.println(str1);//"10"

        boolean b1=true;
        Boolean b2=b1;//自动装箱
        String str2=String.valueOf(b1);
        String str3=String.valueOf(b2);
        System.out.println(str2);
        System.out.println(str3);

        //方式2：
        //基本数据类型的变量+“”
        String str4=i1+"";
        String str5=b1+"";
        System.out.println(str4);
        System.out.println(str5);
    }
    public void test2(){
        String s1="123";
        int i1=Integer.parseInt(s1);
        System.out.println(i1 + 10);//133

        String s2="true";
        boolean b2=Boolean.parseBoolean(s2);

        //特别的
        String s3="123a";
        int i2=Integer.parseInt(s3);
        System.out.println(s3);
        //编译器不会提示，但运行起来会报错
    }
}
