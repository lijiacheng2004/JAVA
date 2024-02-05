package atljc05.field;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: FieldTest
 * Package: atljc05.field
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/8 21:37
 * @Version 1.0
 */
public class FieldTest {
    public static void main(String[] args) {
        Order o1=new Order();
        System.out.println(o1.orderId);
    }
}
class Order{
    int orderId=1;//显示初始化
    {
        orderId=2;
    }
    public Order(){
        orderId=3;
    }

}
