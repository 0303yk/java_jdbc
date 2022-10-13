package com.oracle.da01java;

public class Demo03jige {
    public static void main(String[] argc){
        int a=98;
        if(a>=0 & a<60){
            System.out.println("不及格");
        }
        else if(a>=60 & a<=70){
            System.out.println("及格");
        }
        else if(a>=70 & a<=80){
            System.out.println("中等");
        }
        else if(a>=80 & a<=90){
            System.out.println("良好");
        }
        else if(a>=90 & a<=100){
            System.out.println("优秀");
        }
        else{
            System.out.println("成绩不合法");
        }
    }

}
