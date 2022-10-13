package com.oracle.day02;

public class Demo10 {
    public static void main(String[] args) {
        int[] arry = new int[]{1,2,3,4,7};
        for(int a : arry){
            System.out.println(a);}//增强型for循环

        for(int i=arry.length-1;i>=0;i--){
            System.out.println(arry[i]); }
            System.out.println(arry);
    }
}
