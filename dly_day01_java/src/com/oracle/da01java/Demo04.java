package com.oracle.da01java;

public class Demo04 {
    public static void main(String[] argc){
        int m = 61;
        int n = m/10;
        switch (n){
            case 10:
            case 9:
                System.out.println("优");break;
            case 8:
                System.out.println("良");break;
            case 7:
                System.out.println("中");break;
            case 6:
                System.out.println("及格");break;
            default:
                System.out.println("不及格");

        }
    }
}
