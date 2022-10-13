package com.oracle.day02;

public class Demo03 {
    public static void main(String[] args) {
        int a=1;
        double r=0.003;
        double sum = 10000;
        for(a=1;a<=5;a++){
            sum*=(1+r);
        }
        System.out.println(sum);
//        int a=1;
//        double r=0.003;
//        double sum = 10000;
//        while(a<=5){
//            sum*=(1+r);
//            a++;
//        }
//        System.out.println(sum);
    }
}