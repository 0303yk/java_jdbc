package com.oracle.day03.Demo01;
import java.util.Scanner;

public class Scanner_Demo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("请依此输入教师姓名：");
        String name=sc.next();

        System.out.println("请依此输入教师年龄：");
        int age =sc.nextInt();

        System.out.println("请输入id：");
        int id =sc.nextInt();

        System.out.println("请依此输入住址：");
        String location=sc.next();

        System.out.println("请依此输入教师frined：");
        String friend=sc.next();

        Teacher t = new Teacher(name,age,id,location,friend);
        System.out.println(t);


    }
}
