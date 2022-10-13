package com.oracle.day03.Demo01;

public class Teacher {
    private int age;
    private String name;
    private int id;
    private String location;
    private String friend;
//    public Teacher(){}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }

    public Teacher(String name,int age,  int id, String location, String friend) {
        this.age = age;
        this.name = name;
        this.id = id;
        this.location = location;
        this.friend = friend;

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", location='" + location + '\'' +
                ", friend='" + friend + '\'' +
                '}';
    }
}
