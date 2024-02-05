package atljc05.method_more;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Eg1
 * Package: atljc05.method_more
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/10/31 23:58
 * @Version 1.0
 */
//题目：输入一种字符，用此字符将之后输入的各个字符串连接
public class StringConCatTest {
    public static void main(String[] args) {
        StringConCatTest test=new StringConCatTest();
        String info=test.concat("-", "hello","world");
        System.out.println(info);
    }
    public String concat(String operator,String ... strs){
        String result="";
        for(int i=0;i<strs.length;i++){
            if(i==0){
                result=strs[i];
            }
            else{
                result += (operator+strs[i]);
            }
        }
        return result;
    }
}
