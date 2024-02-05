package atljc10._enum.apply;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: EmployeeTest
 * Package: atljc10._enum.apply
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/19 16:23
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1=new Employee("Tom", 10, Status.BUSY);
        System.out.println(e1);
    }
}
