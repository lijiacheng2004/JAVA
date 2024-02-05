package atljc03.field_method;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Student
 * Package: atljc03.field_method
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/10/25 23:37
 * @Version 1.0
 */
//objarray:对象数组
public class StudentTest {
    public static void main(String[] args) {
        Student[] students=new Student[20];//定义一个对象数组
        for(int i=0;i<students.length;i++){
            students[i]=new Student();
            students[i].number=i+1;
            students[i].score=(int)(Math.random()*101);
            students[i].state=(int)(Math.random()*6+1);
        }
        for(int i=0;i<students.length;i++){
            if(3==students[i].state){
                Student stu=students[i];
                stu.show();
            }
        }
    }
}
