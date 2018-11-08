package com.qzz.library;

/**
 * @ClassName Book
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/5 12:15
 * @Title 愿上苍有好生之德
 **/
public class Book {

    public static final int SIZE = 10;//初始值的大小
    public static  Book[] booklist = new Book[SIZE];//对象数组用来存放书籍列表

    public static int count = 4;
    public static int i = 4;

    private String bookName;
    private String bookWriter;
    private int bookNum;
    private double bookPrice;
    private boolean bookBorrow = true;




    public Book(String bookName, String bookWriter, int bookNum, double bookPrice) {
        this.count = count;
        this.bookName = bookName;
        this.bookWriter = bookWriter;
        this.bookNum = bookNum;
        this.bookPrice = bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookWriter() {
        return bookWriter;
    }

    public double getBookNum() {
        return bookNum;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public boolean getBookBorrow() {
        return bookBorrow;
    }

    public void setBookBorrow(boolean bookBorrow) {
        this.bookBorrow = bookBorrow;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookWriter='" + bookWriter + '\'' +
                ", bookNum=" + bookNum +
                ", bookPrice=" + bookPrice +
                '}';
    }
}
