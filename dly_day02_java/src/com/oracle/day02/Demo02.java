package com.oracle.day02;

public class Demo02 {
    public static void main(String[] args){
        for(int i=01;i<=1000;i++){
            if(i%3==0 & i%5==0 & i%7==0){
                System.out.print(i+" ");
            }
        }
    }
}
