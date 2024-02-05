package atljc13.idea;

import java.util.HashMap;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: KeyMapTest
 * Package: atljc13.idea
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/22 17:35
 * @Version 1.0
 */
public class KeyMapTest {
    public static void main(String[] args) {
        System.out.println("hello world!");
        int c=10;

        String str1= "hello";

        Object obj=str1;
        String str2= (String) obj;

        System.out.println(str2);

        HashMap map=new HashMap();
        map.put("Tom", 89);



    }
}
