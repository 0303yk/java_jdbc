package Hello.system.student;

import java.util.Date;

public class Student {
    private int id;
    private String name;
    private int age;
    private Date birthday;
    private String location;
    private int classno;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(String name, int age, Date birthday, String location, int classno) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.location = location;
        this.classno = classno;
    }

    public Student(int id, String name, int age, Date birthday, String location, int classno) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.location = location;
        this.classno = classno;
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

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

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
}
