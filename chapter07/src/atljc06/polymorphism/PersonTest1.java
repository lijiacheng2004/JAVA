package atljc06.polymorphism;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: PersonTest1
 * Package: atljc06.polymorphism
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/5 14:31
 * @Version 1.0
 */
//向下转型
public class PersonTest1 {
    public static void main(String[] args) {
        Person p1 = new Man();
        //不能直接调用子类特有的结构
        //p1.earnMoney();
        //System.out.println(p1.isSmoking);

        //向下转型
        Man m1 = (Man) p1;
        m1.earnMoney();
        System.out.println(m1.isSmoking);

        System.out.println(p1 == m1);//true：p1与m1指向堆空间的同意个对象

        //建议在向下转型之前，使用instanceof进行判断，避免出现类型转换异常
        //格式：a instanceof A:判断对象a是否是类A的实例

        //eg:
        if (p1 instanceof Man m2) {
            m2.earnMoney();
        }
        if (p1 instanceof Women w2) {
            w2.goShopping();
        }
    }
}
