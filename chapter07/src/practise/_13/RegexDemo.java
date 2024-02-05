package practise._13;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: RegexDemo
 * Package: practise._13
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/2/2 20:03
 * @Version 1.0
 */

import java.util.Scanner;

/**
 * 正则表达式的使用演示类
 */
public class RegexDemo {
    public static void main(String[] args) {
        String mail="bjzhangpeng@tedu.cn";//邮箱
        String mailRegex="[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        if(mail.matches(mailRegex)){//判断字符串是否满足正则表达式的函数
            System.out.println("邮箱格式正确");
        } else{
            System.out.println("格式错误！请修改！");
        }

        //身份证号码的正则
        /**   身份证号码位数 15位 | 18位
         *    123456789012345
         *    12345678901234567X
         */
        Scanner s=new Scanner(System.in);
        String number=s.next();//next接受用户输入的字符串内容
        String Regex="\\d{15}|\\d{17}[\\dXx]";
        if(number.matches(Regex)){
            System.out.println("输入的身份证号码正确！");
        }else{
            System.out.println("输入的身份证号码有误！");
        }

        /**座机号码正则格式:
         *      1234567     7位
         *      12345678    8位
         *  010-  1234567     3位区号-7位电话号码
         *  010-  12345678    3位区号-8位电话号码
         *  0101- 1234567    4位区号-7位电话号码
         *  0101- 12345678   4位区号-8位电话号码
         *  (010)  1234567    (3位区号)7位电话号码
         *  (010)  12345678   (3位区号)8位电话号码
         *  (0101) 1234567   (4位区号)7位电话号码
         *  (0101) 12345678   (4位区号)8位电话号码
         *  \d{7,8}     ---7或8位数字
         *  第一种区号:  \d{3,4}-
         *  第二种区号:  (\d{3,4})
         *  完全的格式:   (\d{3,4}- | (\d{3,4}))?\d{7,8}
         */
        String PhoneRegex="(\\d{3,4}-|(\\d{3,4}))?\\d{7,8}";
        s=new Scanner(System.in);
        number=s.next();//next接受用户输入的字符串内容
        if (number.matches(PhoneRegex)) {
            System.out.println("座机号码格式正确");
        }else{
            System.out.println("格式错误!");
        }

        //split():分割的方法 将传入的正则内容当做分割点，将分割的内容以数组的形式返回
        String str="123abc456def789ghi";
        String[] strArr=str.split("[0-9]+");//以数字串为分割点 分割结果为abcdefghi
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
        String userName="username=123";
        strArr=userName.split("=");
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }

        //replaceAll() 替换函数(支持正则表达式)
        //replace()    替换函数(不支持正则表达式)
        String massage="wr!你这个sb，tmd行不行！";
        String regex="(wr|sb|tmd)";//正则表达式 写出敏感词汇格式
        massage=massage.replaceAll(regex, "***");//正则表达式规则  替换内容
        System.out.println(massage);
    }
}