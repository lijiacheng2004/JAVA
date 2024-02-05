package atljc05.method_more;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: ValueTransferTest
 * Package: atljc05.method_more
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/1 21:12
 * @Version 1.0
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        //数组类型
        int[] arr1=new int[]{1,2,3,4,5};
        int[] arr2=arr1;

        arr2[2]=10;

        System.out.println(arr1[2]);//输出10
        //对象类型
        Order order1=new Order();
        order1.orderId=1001;

        Order order2=order1;
        order2.orderId=1002;

        System.out.println(order1.orderId);//输出1002
        //两个变量名指向了同一个堆中的地址，对其中一个变量名操作另一个也会变

        //其他基本数据类型和上两者不同，变量名与数据均开辟在栈区
    }
}
class Order{
    int orderId;
}

