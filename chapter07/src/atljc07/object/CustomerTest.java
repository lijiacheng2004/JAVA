package atljc07.object;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: CustomerTest
 * Package: atljc07.object
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/6 19:23
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer c1=new Customer("Tom",12,new Account(2000));
        Customer c2=new Customer("Tom",12,new Account(2000));

        System.out.println(c1.equals(c2));//在Customer与Account中重写equals()
    }
}
