package com.oracle.jdbc;

import java.util.Date;

public class Student {
    int id;
    String name;
    int age;
    Date birthday;
    String location;
    int classno;

    public Student(int id, String name, int age, Date birthday, String location, int classno) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.location = location;
        this.classno = classno;
    }

    public Student(String name, int age, Date birthday, String location, int classno) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.location = location;
        this.classno = classno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", location='" + location + '\'' +
                ", classno=" + classno +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getClassno() {
        return classno;
    }

    public void setClassno(int classno) {
        this.classno = classno;
    }
}
