/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: biaoshifu
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/10/21 18:21
 * @Version 1.0
 */
//凡是自己可以起名的地方都叫标识符
public class BiaoShiFu {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    public static void main1(System[] args){
        System.out.println("Hello World!");//无法进入main1
    }

    //1.由26个英文字母大小写，0~9，_或$组成
    //>>数字不可以开头
    //>>不可以使用关键字和保留字，但能包含关键字和保留字
    //>>Java中严格区分大小写，长度无限制
    //>>标识符不能包含空格
    //2.包名：多单词组成时，所有字母小写
    //eg:java.long com.atguigu.bean
    //3.类名、接口名：多单词时，所有单词首字母大写
    //eg:HeloWorld String
    //4.变量名、方法名：多单词组成时，第一个单词首字母小写，之后单词首字母大写
    //eg:age,name,getName
    //5.常量名：所有字母都大写,多单词时每个单词用下划线连接
    //eg:MAX_VALUE DEFAULT_CAPACITY
}
