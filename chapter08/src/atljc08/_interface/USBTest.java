package atljc08._interface;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: USBTest
 * Package: atljc08._interface
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/9 22:39
 * @Version 1.0
 */
public class USBTest {
    public static void main(String[] args) {
        //四种实现设备两两连接的方法

        //1.创建 接口实现类 的对象

        Computer computer=new Computer();
        Printer printer=new Printer();

        computer.transferData(printer);

        //2.创建 接口实现类 的匿名对象
        computer.transferData(new Camera());

        //3.创建 接口匿名实现类 的对象
        USB usb1=new USB() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        };
        computer.transferData(usb1);

        //4.创建 接口匿名实现类 的匿名对象
        computer.transferData(new USB() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        });
    }
}
class Computer{
    public void transferData(USB usb){//多态：USB usb=new Printer()
        System.out.println("设备连接成功");
        usb.start();

        System.out.println("数据传输的细节操作");

        usb.stop();
    }
}
class Printer implements USB{
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}
class Camera implements USB{
    @Override
    public void start() {
        System.out.println("照相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("照相机结束工作");
    }
}
interface USB{
    //声明常量


    //方法
    void start();
    void stop();
}