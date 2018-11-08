package com.qzz.library;

import com.qzz.library.impl.impl;
import com.qzz.main.Test;

import java.util.*;
/**
 * @ClassName User
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/5 19:43
 * @Title 愿上苍有好生之德
 **/
//1、查询书籍 2、借阅书籍 3、归还书籍 4、退出

public class User extends Person implements impl.CommonInterface {
    FirstFace fristFace;
    Book book;
    Test test;
    Admin admin;
    private String username;
    private String usersex;
    private int userage;

    public User(String username, String usersex, int userage) {
        super(username, usersex, userage);
    }

    public void UserStory() {
        while (true) {
            System.out.println("--------------------------User界面--------------------------\n");
            System.out.print("请选择: 1、查询书籍 2、借阅书籍 3、归还书籍 4、退出\n\n");

            Scanner scanner = new Scanner(System.in);

            int Choose = scanner.nextInt();
            System.out.println();

                switch (Choose) {
                    case 1:
                        lookUp();
                        break;
                    case 2:
                        borrow();
                        break;
                    case 3:
                        back();
                        break;
                    case 4:
                        quit();
                        break;
                    default:
                        UserStory();


                }

        }
    }



    public void back() {
    /*    boolean hasBook = true;//假设有此书
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择要还的书籍: ");
        String bookName = scanner.next();
        System.out.println();
        int index;
        for (int i = 0; i < book.count; i++) {
            if (booklist[i].getBookName().equals(bookName)) {
                if (booklist[i].getBookBorrow() == true) {
                    System.out.println("此书没有被借走请重新输入: ");
                    back();
                } else {
                    booklist[i].setBookBorrow(true);
                    System.out.println("操作成功: 此书已还");
                }
                hasBook = true;
                break;
            }else{
                hasBook = false;
            }
        }
        if(hasBook == false){
            System.out.println("并没有此书");
            System.out.println();
            UserStory();
        }
        System.out.println();
        System.out.println("继续还书吗:  是/否 ");
        String d = scanner.next();
        if (d.equals("是")) {
            borrow();
        } else {
            UserStory();
        }*/
        boolean hasBook = true;//假设有此书
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要还的书籍名称: ");
        String bookName = scanner.next();
        System.out.println("请输入作者姓名: ");
        String bookWriter = scanner.next();
        System.out.println("请输入书籍的编号: ");
        int bookNum = scanner.nextInt();
        System.out.println("请输入书籍的价格: ");
        double bookPrice = scanner.nextDouble();
        System.out.println();

        for (int i = 0; i < book.count; i++) {
            if ((test.booklist[i].getBookNum() == (bookNum))) {
                System.out.println("与此书编号相同:   " + test.booklist[i].getBookName()+"   编号:   "+test.booklist[i].getBookNum());
                System.out.println();
                if(test.booklist[i].getBookNum() == bookNum){
                    back();
                }
            }
        }
        test.booklist[book.i] = new Book(bookName,bookWriter,bookNum, bookPrice);
        System.out.println("此书已还");
        book.i++;
        book.count++;

        System.out.println("当前书籍的数量为: " + book.count);
        System.out.println();
        System.out.println("是否需要继续还书籍:  是/否 ");
        String c = scanner.next();

        if (c.equals("是")){

            back();
        }else{
            UserStory();
        }

    }


    public void borrow() {
        /*boolean hasBook = true;//假设有此书
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择要借的书籍: ");
        String bookName = scanner.next();
        int index;
        for (int i = 0; i < book.count; i++) {

            if (booklist[i].getBookName().equals(bookName)) {
                if (booklist[i].getBookBorrow() == true) {
                    booklist[i].setBookBorrow(false);
                    System.out.println("操作成功: 此书已被借出");
                } else {
                    System.out.println("此书已被借出");
                }
                hasBook = true;
                break;

            }else{
                hasBook = false;
            }
        }
        if(hasBook == false){
            System.out.println("并没有此书");
            System.out.println();
            UserStory();
        }
        System.out.println();
        System.out.println("是否需要继续借书:  是/否 ");
        String d = scanner.next();
        if (d.equals("是")) {
            borrow();
        } else {
            UserStory();
        }*/

        boolean hasBook = true;//假设有此书
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择要借的书籍: ");
        String bookName = scanner.next();
        System.out.println();
        int index;
        for (int i = 0; i< book.count; i++){

            if (test.booklist[i].getBookName().equals(bookName)) {
                for (index = i; index <= book.count; index++) {
                    if (index == book.count) {
                        book.count--;
                        book.i--;
                        break;
                    }
                    test.booklist[index] = test.booklist[index + 1];
                }
                hasBook = true;
                break;
            }
            else{
                hasBook = false;
            }
        }
        if(hasBook == false){
            System.out.println("并没有此书");
            System.out.println();
            UserStory();
        }

        System.out.println("当前书籍的数量为: " + book.count);
        System.out.println();
        System.out.println("是否需要继续借书:  是/否 ");
        String d = scanner.next();
        if (d.equals("是")){
            book.i++;
            borrow();
        }else{
            UserStory();
        }
    }

    @Override
    public void lookUp() {
        boolean hasBook = true;//假设有此书
        Scanner scanner = new Scanner(System.in);
        System.out.println("请填要查阅的书籍名称: ");
        String bookName = scanner.next();
        System.out.println();
        for (int i = 0; i < book.count; i++) {
            if ((test.booklist[i].getBookName().equals(bookName))) {

                //System.out.println("库中第"+booklist[i]+"本书:");
                System.out.println("书籍名称: " + test.booklist[i].getBookName() + "  \n" + "作者姓名: " + test.booklist[i].getBookWriter() +
                        "  \n" + "书籍的编号: " + test.booklist[i].getBookNum() + "  \n" + "书籍的价格: " + test.booklist[i].getBookPrice());
                if (test.booklist[i].getBookBorrow() != true) {
                    System.out.println("此书已经被借走");
                }
                hasBook = true;
                break;
            }else{
                hasBook = false;
            }

        }
        if(hasBook == false){
            System.out.println("并没有此书");
            System.out.println();
            UserStory();
        }
        System.out.println();
        System.out.println("是否需要继续查阅书籍:  是/否 ");
        String d = scanner.next();
        if (d.equals("是")) {
            lookUp();
        } else {
            UserStory();
        }




    }
    public void quit(){
        fristFace.start();
    }
}
