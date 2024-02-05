package atljc04.block;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: User
 * Package: atljc04.block
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/7 23:56
 * @Version 1.0
 */
public class User {
    private String userName;
    private String password;
    private final long registrationTime;//注册时间

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }
    public User(){
        System.out.println("新用户注册");
        registrationTime =System.currentTimeMillis();//获取系统当前时间
                                                     //距离1970-1-1 00:00:00的毫秒数
        userName=System.currentTimeMillis()+"";
        password="123456";
    }

    public User(String userName, String password) {
        System.out.println("新用户注册");
        registrationTime=System.currentTimeMillis();
        this.userName = userName;
        this.password = password;
    }
    public String getInfo(){
        return "用户名"+userName+",密码"+password+",注册时间"+registrationTime;
    }
}
