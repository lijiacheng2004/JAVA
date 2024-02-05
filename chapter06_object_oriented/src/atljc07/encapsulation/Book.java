package atljc07.encapsulation;

/**
 * project(工程)-module(模块)-package(包)-class(类)
 * ClassName: Book
 * Package: atljc07.encapsulation
 * Description:
 *
 * @Author Lee JiaCheng
 * @Create 2023/11/2 22:19
 * @Version 1.0
 */
public class Book {
    private String bookname;
    private String author;
    private double price;

    public String getBookName() {
        return bookname;
    }

    public void setBookName(String bn) {
        bookname = bn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String au) {
        author = au;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double pr) {
        price = pr;
    }
    public String showInfo(){
        return "bookName:"+bookname+",author:" +
                author+",price:"+price;
    }
}
