package com.oracle.da01java;

public class Demo05 {
    public static void main(String[] argc){
        int a=10,b=20,c=30,x=5;
        System.out.println(((a>b)==(b==c)==(c<a)));
        System.out.println((a!=b)==(a!=c)==(c==a));
        System.out.println(!(a>b));
        System.out.println(x*=x/=x+x);
        int m=9,n;
        n=++m;
        n=m++;
        System.out.println(m);
        System.out.println(n);

    }

}
