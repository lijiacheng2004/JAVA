package atljc05.method_more;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: ValueTransferTest2
 * Package: atljc05.method_more
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/1 22:33
 * @Version 1.0
 */
public class ValueTransferTest2 {
    public static void main(String[] args) {
        ValueTransferTest2 test=new ValueTransferTest2();
        Data data=new Data();
        data.m=10;
        data.n=20;

        test.swap(data);

        System.out.println("m="+data.m+",n="+data.n);
    }
    public void swap(Data data){
        int temp;
        temp= data.m;
        data.m=data.n;
        data.n=temp;
    }
}
class Data{
    int m;
    int n;
}
