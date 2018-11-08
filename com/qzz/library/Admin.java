package com.qzz.library;
/**
 * @ClassName Admin
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/5 19:37
 * @Title 愿上苍有好生之德
 **/

import com.qzz.library.impl.impl;
import com.qzz.main.Test;

import java.util.Comparator;
import java.util.*;


/**
 * 当前管理员 :钱智哲 男 20
 *
 *1、整理书籍 2、查阅书籍 3、增加书籍 4、删除书籍 5、打印书籍列表 6、退出
 *
 *
 */

public class Admin  extends Person implements impl.CommonInterface {
    FirstFace firstFace;
    Test test;
    Book book;
    private String adminname;
    private String adminsex;
    private int adminage;

    Admin[] admin = new Admin[6];


    public Admin(String adminname, String adminsex, int adminage){
        super(adminname, adminsex, adminage);

    }
    public void AdminStory(){
        while(true){
            System.out.println("------------------------------Admin界面---------------------------\n");
            System.out.print("请选择: 1、整理书籍 2、查阅书籍 3、增加书籍 4、删除书籍 5、打印书籍列表 6、退出\n\n");
            Scanner scanner = new Scanner(System.in);

            int adminChoose = scanner.nextInt();
            System.out.println();
            switch(adminChoose){
                case 1:sortBook();break;
                case 2:lookUp();break;
                case 3:insert();break;
                case 4:delect();break;
                case 5:printBookList();break;
                case 6:quit();break;
            }
        }
    }




    public void sortBook() {
        System.out.println("当前书籍列表为: ");
        for (int i = 0; i< book.count; i++){
            System.out.print("书籍名称: " + test.booklist[i].getBookName() + "  "+"作者姓名: " + test.booklist[i].getBookWriter() +
                    "  " +"书籍的编号: "+test.booklist[i].getBookNum()+"  "+"书籍的价格: " + test.booklist[i].getBookPrice());
            System.out.println();
            if( test.booklist[i] == null){
                break;
            }
        }
        System.out.println();
        System.out.println("请选择想要排序的方式: ");

        System.out.print("1、按书籍名 2、按作者姓名字母 3、按价格大小 4、退出\n\n");
        Scanner scanner = new Scanner(System.in);

        int Choose = scanner.nextInt();

        switch(Choose){
            case 1:paixu1();break;
            case 2:paixu2();break;
            case 3:paixu3();break;
            case 4:AdminStory();break;
        }

    }
    public void paixu1(){
        Book[] newBook = new Book[book.count];
        System.arraycopy(test.booklist,0,newBook,0,book.count);
        Arrays.sort(newBook, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
             return o1.getBookName().compareTo(o2.getBookName());
            }
        });
        System.arraycopy(newBook,0,test.booklist,0,book.count);
        printBookList();
    }

    public void paixu2(){
        Book[] newBook = new Book[book.count];
        System.arraycopy(test.booklist,0,newBook,0,book.count);
        Arrays.sort(newBook, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
              return o1.getBookWriter().compareTo(o2.getBookWriter());
            }
        });
        System.arraycopy(newBook,0,test.booklist,0,book.count);
        printBookList();
    }
    public void paixu3(){
        Book[] newBook = new Book[book.count];
        System.arraycopy(test.booklist,0,newBook,0,book.count);
        Arrays.sort(newBook, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int)(o1.getBookPrice()-o2.getBookPrice());
            }
        });
        System.arraycopy(newBook,0,test.booklist,0,book.count);
        printBookList();
    }


    public void delect() {
        boolean hasBook = true;//假设有此书
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择要删除的书籍: ");
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
            AdminStory();
        }

        System.out.println("当前书籍的数量为: " + book.count);
        System.out.println();
        System.out.println("是否需要继续删除书籍:  是/否 ");
        String d = scanner.next();
        if (d.equals("是")){
            book.i++;
            delect();
        }else{
            AdminStory();
        }
    }


    public void printBookList() {
        for (int i = 0; i< book.count; i++){
            //System.out.println("库中第"+booklist[i]+"本书:");
            System.out.println("书籍名称: " + test.booklist[i].getBookName() + "   \n"+"作者姓名: " + test.booklist[i].getBookWriter() +
                    "    \n" +"书籍的编号: "+test.booklist[i].getBookNum()+"    \n"+"书籍的价格: " + test.booklist[i].getBookPrice());
            System.out.println();
            if( test.booklist[i] == null){
                break;
            }
        }
    }

    @Override
    public void lookUp() {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("请填要查阅的书籍名称: ");
        String bookName = scanner.next();
        for (int i = 0; i< book.count; i++){
            if (booklist[i].getBookName().equals(bookName)) {
                //System.out.println("库中第"+booklist[i]+"本书:");
                System.out.println("书籍名称: " + booklist[i].getBookName() + "  \n"+"作者姓名: " + booklist[i].getBookWriter() +
                        "  \n" +"书籍的编号: "+booklist[i].getBookNum()+"  \n"+"书籍的价格: " + booklist[i].getBookPrice());
            }
        }*/
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
            AdminStory();
        }
        System.out.println();
        System.out.println("是否需要继续查阅书籍:  是/否 ");
        String d = scanner.next();
        if (d.equals("是")) {
            lookUp();
        } else {
            AdminStory();
        }

    }


    public void insert() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要添加的书籍名称: ");
        String bookName = scanner.next();
        System.out.println("请输入作者姓名: ");
        String bookWriter = scanner.next();
        System.out.println("请输入书籍的编号: ");
        int bookNum = scanner.nextInt();
        System.out.println("请输入书籍的价格: ");
        double bookPrice = scanner.nextDouble();
        System.out.println();

        for (int i = 0; i < book.count; i++) {
            if ((test.booklist[i].getBookName().equals(bookName))) {
                    System.out.println("库中有此书:" + test.booklist[i].getBookName()+"编号"+test.booklist[i].getBookNum());
                    if(test.booklist[i].getBookNum() == bookNum){
                        insert();
                    }
                }
            }
        test.booklist[book.i] = new Book(bookName,bookWriter,bookNum, bookPrice);
        print();
        book.i++;
        book.count++;

        System.out.println("当前书籍的数量为: " + book.count);
        System.out.println();
        System.out.println("是否需要继续添加书籍:  是/否 ");
        String c = scanner.next();

        if (c.equals("是")){

            insert();
        }else{
            AdminStory();
        }

    }

    void print(){

        System.out.println("书籍名称: " + test.booklist[book.i].getBookName() + "  \n"+"作者姓名: " + test.booklist[book.i].getBookWriter() +
                "  \n" +"书籍的编号: "+test.booklist[book.i].getBookNum()+"  \n"+"书籍的价格: " + test.booklist[book.i].getBookPrice());
    }
    //退出
    public void quit(){
        firstFace.start();
    }


    public String getAdminname() {
        return adminname;
    }

    public String getAdminsex() {
        return adminsex;
    }

    public int getAdminage() {
        return adminage;
    }
}




