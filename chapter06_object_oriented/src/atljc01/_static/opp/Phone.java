package atljc01._static.opp;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Phone
 * Package: atljc01.opp
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/10/25 0:03
 * @Version 1.0
 */
//此Phone为模板类,模板类不需要添加main方法
public class Phone {
    String name;//成员变量
    double price;//成员变量

    public void call() {
        System.out.println("手机能够拨打电话");
    }
    public void sendMessage(String message){
        System.out.println("发送消息："+message);
    }
    public void playGame(){
        System.out.println("游戏开始！");
    }
    public void sayHello(){
        String info="hello!"; //局部变量
        System.out.println(info);
    }
}
