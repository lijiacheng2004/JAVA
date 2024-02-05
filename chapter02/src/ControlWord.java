/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: controlword
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/10/23 19:09
 * @Version 1.0
 */
import java.util.Scanner;//2.1

public class ControlWord {
    public static void main(String[] args) {
        //1.
        /*if (){

        }
        else if () {

        }*/
        //2.用Scanner类获取不同类型数据的步骤
        //2.1.导包 import java.util.Scanner
        //2.2.创建一个实例
        //2.3调用Scanner类中的方法，获取指定类型的数据
        //2.4关闭资源 close()

        Scanner scan=new Scanner(System.in);//2.2

        System.out.println("请输入你的姓名");
        String name=scan.next();//2.3 next():String

        System.out.println("请输入你的年龄：");
        int age=scan.nextInt();//注意接受的类型：int

        System.out.println("name="+name+",age="+age);

        boolean b=name.equals("李佳承");//判断name是否等于“李佳承”

        scan.close();//2.4

        //3.
        /*switch (){
            case 1:
                //
                break;
            case 2:
                //
                break;
            default:
        }*/


    }
}
