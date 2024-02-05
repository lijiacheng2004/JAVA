package practise._12;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: StringAPIDemo
 * Package: practise._12
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2024/2/1 23:55
 * @Version 1.0
 */

/**
 * StringAPI的使用演示类：
 */

public class StringAPIDemo {
    public static void main(String[] args) {

        String str="Thinking in java是一本好书";


        /**
         *  1. length();获取字符串内容长度
         *     charAt(int index);通过给定下标获取对应的字符内容。
         */
        int length=str.length();//方法
        System.out.println(length);//21
        char t=str.charAt(20);//根据传入的下标值，返回对应的下标的字符内容
        System.out.println(t);//书
        /**
         * 请编写一段程序:
         * 将str字符串对象中的"Thinking in java是一本好书"中i所存在的次数统计打印出来!
         */
        int idx=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='i'){
                idx++;
            }
        }
        System.out.println("i存在的次数为："+idx);


        /**
         * 2.  检索：
         *     indexOf(); 从首到尾,检索传入的字符/字符串内容,检索到后立刻返回对应的下标值
         *     lastIndexOf(); 从尾到首,检索传入的字符/字符串内容,检索到后立刻返回对应的下标值
         *     如果检索的内容在字符串对象中不存在,则返回-1
         */
        int index=str.indexOf('i');
        System.out.println(index);
        index=str.indexOf('i',3);
        System.out.println(index);
        index=str.indexOf("java");
        System.out.println(index);
        index=str.lastIndexOf('书');
        System.out.println(index);


        /**
         * 字符串内容转大写,转小写,去除字符串两端空白,判断是否以..开头,以...结尾的方法.
         */
        str=str.toUpperCase();//转为纯大写
        System.out.println(str);
        str=str.toLowerCase();//转为纯小写
        System.out.println(str);
        String str1=" Tom ";
        System.out.println(str1);
        str1=str1.trim();//去除字符串两端空白行
        System.out.println(str1);
        boolean r=str1.startsWith("T");//根据传入的内容，判断字符串对象是否以该内容开头
        System.out.println(r);
        r=str1.endsWith("m");//判断字符串是否以某内容结尾
        System.out.println(r);


        /**
         * 截取字符串中内容的方法,可以将数值内容转换为String类型的方法
         */
        String mail="bjzhangpeng@tedu.cn";
        //substring: 1.开始截取的下标 2.结束截取的下标(不包尾)
        String userName=mail.substring(0,11);//bjzhangpeng(不包含尾部)
        System.out.println(userName);
        mail="ZYP12345@qq.com";
        userName=mail.substring(0, mail.indexOf('@'));
        System.out.println(userName);


        /**
         *
         */
        str="OOP";
        r=str.contains("OO");//判断传入的字符串内容，是否包含在当前字符串对象中
        System.out.println(r);
        int a=123456;
        String str2=String.valueOf(a);//将传入的类型转化为String对象
        System.out.println(str2);

        String name="佳良";
        r=name.isEmpty();//判断当前字符串对象长度是否为0的方法
        System.out.println(r);//false
        name="";
        System.out.println(name.isEmpty());//true
//        name=null;
//        System.out.println(name.isEmpty());//判断长度为0的前提是有对象，否则报空指针异常

        name="黄步挺";
        char[] chars=name.toCharArray();//将字符串对象的内容转化为char数组来存储
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        /**1.练习：
         *  有以下字符串内容：
         *  String str = "上海自来水来自海上";
         *  请编写一段程序,判断str对象中的内容是否是回文数！
         */
        String str3 = "上海自来水来自海上";
        boolean result=true;//默认true
        for (int i = 0; i < str3.length()/2; i++) {
            if(str3.charAt(i)!=str3.charAt(str3.length()-1-i)){
                result=false;
                break;
            }
        }
        System.out.println("是否是回文数："+result);

        /**2.练习
         *  有以下字符串内容
         *  String str = "1,永远年轻2,永远热泪盈眶3,永远在路上4,向阳而生！";
         *  请编写一段程序,将该字符串对象中,是数值的内容的数据,进行累加求和
         */
        String str4 = "1,永远年轻2,永远热泪盈眶3,永远在路上4,向阳而生！";
        int sum=0;
        for (int i = 0; i < str4.length(); i++) {
            if(str4.charAt(i)>='1'&&str4.charAt(i)<='9'){
                sum+=str4.charAt(i)-48;////将字符 -48 拿到对应的数值 累加给sum
            }
        }
        System.out.println("累计和:"+sum);

        //String不可变性,一旦对String进行修改,会在内存中产生新对象.如果频繁产生新对象,对性能消耗非常大,所以一般如果需要频繁的拼接String内容,不建议使用String进行操作.
        //        如果不断产生新对象,频率特别快的情况下,内存空间极有可能被占满:出现内存溢出异常OutOfMemoryError.

        String str5="a";
        StringBuilder builder1=new StringBuilder(str5);
        long start=System.currentTimeMillis();//获取当前系统时间(ms)
        for (int i = 0; i < 100000; i++) {
        //  str+="a";//每次拼接一个a
            builder1.append("a");
        }
        long end=System.currentTimeMillis();
        System.out.println("运行了："+(end-start)+"ms");
        //java 有GC ,我们不用担心垃圾的回收问题！


        //当在程序中，需要对String的内容进行频繁修改时，建议用StringBuilder
        //StringBuilder：增删改查，反序等
        String str6="好好学习";
        StringBuilder builder=new StringBuilder(str6);
        System.out.println(builder);
        //append:追加，在当前的字符串内容后方
        builder.append(",为了找份好工作！");
        builder.append(555);
        System.out.println(builder);
        //replace:替换 (不包尾)
        builder.replace(5,13,"为了改变世界！");//开始替换的下标 结束替换的下标 替换内容(不包尾)
        System.out.println(builder);
        //delete：删除 (不包尾)
        builder.delete(12,15);//开始删除的下标 结束删除的下标
        System.out.println(builder);
        //insert:插入
        builder.insert(0, "加油，");//开始插入的下标 插入的内容
        System.out.println(builder);
        //reverse:反序
        builder.reverse();
        System.out.println(builder);
    }
}
