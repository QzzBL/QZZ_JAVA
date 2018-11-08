package com.qzz.main;

import com.qzz.library.Admin;
import com.qzz.library.Book;
import com.qzz.library.FirstFace;
import com.qzz.library.User;

/**
 * @ClassName Test
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/6 10:18
 * @Title 愿上苍有好生之德
 **/

public class Test  {
    public Book book;
    public static FirstFace firstFace;

    User user;
    Admin admin;

    public static final int SIZE = 10;//初始值的大小
    public static  Book[] booklist = new Book[SIZE];//对象数组用来存放书籍列表

    public static void main(String[] args) {
       booklist[0] = new Book("谁的青春不迷茫","刘同",0,21);
       booklist[1] = new Book("向这光亮那方","刘同",1,22);
       booklist[2] = new Book("你的孤独，虽败犹荣","刘同",2,22);
       booklist[3] = new Book("我在未来等你","刘同",3,23);
       firstFace.start();

    }

}
