/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: bianliang
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/10/23 0:21
 * @Version 1.0
 */
public class BianLiang {
    public static void main(String[] args) {
        //1.boolean:布尔型
        int age;
        age=10;
        System.out.println("age="+age);//输出“age=10”：'+'号如字符串一样累加打印的内容

        //2.整型变量 byte
        byte a1=12;
        System.out.println("a1="+a1);

        //3.字符型
        //Unicode值相当于C中的ASCII码，一样的用法

        //4,String类型
        String name="李华";
        int age1=10;
        System.out.println("name="+name+",age="+age);

        System.out.println(3+4+"HELLO");//7HELLO
        System.out.println("HELLO"+3+4);//输出不一样 HELLO34
    }

    /*public static void main123(String[] args) {
        System.out.println("age="+age);//变量有作用域
    }*/

}
