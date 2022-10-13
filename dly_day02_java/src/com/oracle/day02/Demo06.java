package com.oracle.day02;

public class Demo06 {
    public static void main(String[] args) {
        int n=158;
        int i=0;
        for(i=2; i<n/2;i++){
            if(n%i==0){
                System.out.println("不是素数");
                break;
            }
        }
        if(i >= n/2){
            System.out.println("是素数");
        }
    }
}
