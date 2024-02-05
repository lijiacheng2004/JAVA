package atljc07.object;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Accont
 * Package: atljc07.object
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/6 19:16
 * @Version 1.0
 */
public class Account {
    private double balance;//余额

    public Account(){
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;//向下转型
        return Double.compare(balance, account.balance) == 0;//比较余额数值是否相等
    }
}
