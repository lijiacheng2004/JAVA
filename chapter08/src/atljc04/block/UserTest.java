package atljc04.block;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: UserTest
 * Package: atljc04.block
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/8 0:20
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1=new User();
        System.out.println(u1.getInfo());

        User u2=new User("Tom","654321");
        System.out.println(u2.getInfo());

        System.out.println();
        User1 u3=new User1();
        System.out.println(u3.getInfo());
    }
}
