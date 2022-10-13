package com.oracle.day02;

public class Demo08 {
    public static void main(String[] args){
                int i,j;
                int n=0;
                for(i=2;i<=10000;i++) {
                    for( j=2;j<i/2;j++) {
                        if (i%j==0){
                            break;}
                    }
                    if (j>=i/2) {
                        n++;
                        System.out.println(i+" ");
                        //和为5736401
                    }
                }
        System.out.println(n+"个");
            }

}
