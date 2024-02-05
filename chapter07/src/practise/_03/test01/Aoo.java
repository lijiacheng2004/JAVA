package practise._03.test01;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Aoo
 * Package: practise._03.test01
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/24 15:19
 * @Version 1.0
 */
/*
   访问修饰符测试：
   public：公开：   当前类/同包类/子类/非同包类
   protected：保护：当前类/同包类/子类
   默认：（无）：    当前类/同包类
   private：私有：  当前类
 */
public class Aoo {
    public int a;//公开
    protected int b;//保护
    int c;//默认
    private int d;//私有的
    void test(){
        a=1;//当前类中，均可见
        b=2;
        c=3;
        d=4;
    }
}
class Boo{//同包类
    void test(){
        Aoo aoo=new Aoo();
        aoo.a=1;
        aoo.b=2;
        aoo.c=3;
        //aoo.d=4;报错
    }
}
