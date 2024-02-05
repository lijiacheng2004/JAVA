package atljc05.method_more;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Overload
 * Package: atljc05.method_more
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/10/26 0:00
 * @Version 1.0
 */
public class Overload {//重载：相同：同一个类，相同的方法名
                          //  不同:参数列表不同
    public int add(int i,int j){
        return i+j;
    }
    public double add(int i,double j){
        return i+j;
    }
}
