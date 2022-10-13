package com.oracle.da01java;

public class Demo06 {
    public static void main(String[] argc){
        int a=15;
        if(a%3!=0 && a%5!=0 && a%7!=0){
            System.out.println("能被3，5，7整除");
        }else {
            System.out.println("不能被3，5，7整除");
        }
    }
}
