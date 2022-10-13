package com.oracle.day03.Demo01;

public class Stumain {
    public static void main(String[] args){
        Student a = new Student();
        a.age=19;
        a.id_numder=201019;
        a.name="Rose";
        a.sex="男";
        a.show();
        //------------------------
// 创建对象：类名 变量名 =new 构造方法（）；
        Student  stu =new Student();
        stu.setName("meimei");
        String n =stu.getName();
        System.out.println(n);

    }
}
