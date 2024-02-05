package practise._03.test02;

import practise._03.test01.Aoo;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Coo
 * Package: practise._03.test02
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/1/24 15:20
 * @Version 1.0
 */
public class Coo {
    void test(){
        Aoo aoo=new Aoo();
        aoo.a=1;
      //aoo.b=2;报错
      //aoo.c=3;报错
      //aoo.d=4;报错
    }
}
class Doo extends Aoo{
    void test(){
        a=1;
        b=2;
        //c=3;报错
        //d=4;报错
    }
}
