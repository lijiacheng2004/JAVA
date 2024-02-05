package atljc05.method_more;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: VariableNumberParameters
 * Package: atljc05.method_more
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/10/26 21:47
 * @Version 1.0
 */
public class VariableNumberParameters {//参数可变个数

    public static void main(String[] args) {
        VariableNumberParameters test=new VariableNumberParameters();
        test.print();
        test.print(1);
        test.print(2,3);//优先匹配确定的，再考虑兼容的
    }
    public void print(int ... num){//无论参数数量，均可调用此方法
        System.out.println("1111");//相当于在方法里创了一个数组，传入的参数储存在num数组里
    }
    public void print1(int i,int ... num){}//int ... num必须在参数列表最后位置，且在列表中只能出现一次
    public void print(int i){
        System.out.println("2222");
    }
    public void print(int i,int j){
        System.out.println("3333");
    }

}
