package atljc07.encapsulation;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: BookTest
 * Package: atljc07.encapsulation
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/2 22:19
 * @Version 1.0
 */
//encapsulation:封装性
public class BookTest {
    public static void main(String[] args) {
        Book book1=new Book();
        book1.setBookName("我的奋斗");
        book1.setAuthor("希特勒");
        book1.setPrice(100);

        System.out.println(book1.showInfo());
    }
}
