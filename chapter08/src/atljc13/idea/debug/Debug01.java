package atljc13.idea.debug;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Debug01
 * Package: atljc13.idea.debug
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/22 22:48
 * @Version 1.0
 */
public class Debug01 {
    public static void main(String[] args) {
        //1.
        int m=10;
        int n=20;
        System.out.println("m="+m+",n="+n);
        swap(m, n);
        System.out.println("m="+m+",n="+n);

    }
    public static void swap(int m,int n){
        int temp=m;
        m=n;
        n=temp;
    }
}
