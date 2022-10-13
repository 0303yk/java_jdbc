package com.oracle.day03.Demo01;

import java.util.Scanner;

public class Demo_Scanner {

    public static void main(String[] args){
        System.out.println("请依此输入教师姓名： "+"年龄:  "+"id:   "+"住址:  "+"银行卡号:"+"\n");
        Scanner s=new Scanner(System.in);
        System.out.println(s.nextLine());
    }
}
