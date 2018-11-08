package com.qzz.library;

import java.util.Scanner;

/**
 * @ClassName FirstFace
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/6 15:17
 * @Title 愿上苍有好生之德
 **/
public class FirstFace {
    Book book;
    User user;
    Admin admin;
    public static void start(){

        while(true) {
            System.out.println("------------图论科技图书管理系统------------\n");
            System.out.print("请登录：1：普通用户   2：管理员登录\n\n");
            Scanner in = new Scanner(System.in);

            int choose = in.nextInt();
            Scanner scan = new Scanner(System.in);
            //Person p = null;
            switch(choose){
                case 1:
                    System.out.print("请输入：姓名 \n");
                    String usrname = scan.next();
                    System.out.print("请输入：性别 \n");
                    String usrsex = scan.next();
                    System.out.print("请输入：年龄 \n");
                    int usrage = scan.nextInt();

                    User userPerson = new User(usrname,usrsex,usrage);
                    System.out.println("当前用户："+usrname+" "+usrsex+" "+usrage);
                    userPerson.UserStory();

                    break;
                case 2:
                    System.out.print("请输入：姓名 \n");
                    String adminname = scan.next();
                    System.out.print("请输入：性别 \n");
                    String adminsex = scan.next();
                    System.out.print("请输入：年龄 \n");
                    int adminage = scan.nextInt();
                    Admin adminPerson = new Admin(adminname,adminsex,adminage);

                    System.out.println("当前管理员："+adminname+" "+adminsex+" "+adminage);
                    adminPerson.AdminStory();
                    //adminChoose(adminPerson);
                    //p = new AdminPerson(adminname,adminsex,adminage);
                    break;
            }
            //  p.choose(booklist,count);
        }
    }
}
