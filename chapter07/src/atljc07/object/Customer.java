package atljc07.object;

import java.util.Objects;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Customer
 * Package: atljc07.object
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/6 19:19
 * @Version 1.0
 */
public class Customer {
    private String name;
    private int age;
    private Account acct;

    public Customer() {
    }

    public Customer(String name, int age, Account acct) {
        this.name = name;
        this.age = age;
        this.acct = acct;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Account getAcct() {
        return acct;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAcct(Account acct) {
        this.acct = acct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(name, customer.name) && Objects.equals(acct, customer.acct);
    }
}
