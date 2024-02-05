package atljc12.wrapper.exer;

import java.util.Scanner;
import java.util.Vector;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: ScoreTest
 * Package: atljc12.wrapper.exer
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/21 23:45
 * @Version 1.0
 */
public class ScoreTest {
    public static void main(String[] args) {
        //1.创建Vector对象：Vector v=new Vector();
        Vector v=new Vector();

        Scanner scanner=new Scanner(System.in);

        int maxScore=0;//记录最高分

        //2.从键盘获取多个学生成绩，存放到v中(以负数代表输入结束)
        while (true){
            System.out.println("请输入学生成绩(以负数代表输入结束):");
            int intScore= scanner.nextInt();

            if(intScore<0){
                break;
            }

            //Integer score=Integer.valueOf(intScore);

            //v.addElement(score);

            //jdk5.0之后,自动装箱
            v.addElement(intScore);//将int型自动转化为Object类

            //3.获取学生成绩的最大值
            if(intScore>maxScore){
                maxScore=intScore;
            }
        }

        //4.依次获取v中的每个学生成绩，与最高分进行比较，获取学生等级，并输出
        for(int i=0;i<v.size();i++){
            Object objectScore = v.elementAt(i);//vector内的元素都是Object类
//             Integer integerScore=(Integer) objectScore;
            //拆箱
///            int score=integerScore.intValue();

            //自动拆箱
            int score=(Integer)objectScore;
            char grade;
            if(maxScore-score<=10){
                grade='A';
            }else if(maxScore-score<=20){
                grade='B';
            }else if(maxScore-score<=30){
                grade='C';
            }else{
                grade='D';
            }
            System.out.println("student"+i+" score is "+score+" grade is "+grade);
        }
        scanner.close();
    }
}
