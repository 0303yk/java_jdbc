package com.oracle.day03.Demo01;

public class Student {
    //成员变量
   String name;
   int age;
   String sex;
   int id_numder;

   public Student(){ }
   public void show(){
       String id_number;
       System.out.println(age);
       System.out.println(sex);
       System.out.println(name);
       System.out.println(id_numder);
   }
   public void setName(String n){ name=n; }
   public String getName(){ return name; }
}
