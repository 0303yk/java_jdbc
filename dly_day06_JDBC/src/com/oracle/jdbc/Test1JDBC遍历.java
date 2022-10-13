package com.oracle.jdbc;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Test1JDBC遍历 {
    public static void main(String[] args) throws Exception {
        /*Student s =
                new Student("李明",30,new java.util.Date(),"哈尔滨",190101);
        System.out.println("成功插入了"+addOne(s)+"条数据");*/
        show(findAll());
    }
    //展示所有数据
    public static void show(List<Student> list) throws Exception{
        System.out.println("id\tname\tage\tbirthday\tlocation\tclassno");
        for (Student s : list) {
            System.out.println(s.getId() +
                    "\t" + s.getName() +
                    "\t" + s.getAge() +
                    "\t" + s.getBirthday() +
                    "\t" + s.getLocation() +
                    "\t" + s.getClassno());
        }
    }
    //查询所有数据
    public static List<Student> findAll() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/2021dly", "root", "123456");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from student");//用执行查询的方法执行sql语句
        List<Student> list = new ArrayList<>();
        while(resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            int age = resultSet.getInt(3);
            Date birthday = resultSet.getDate(4);
            String location = resultSet.getString(5);
            int classno = resultSet.getInt("classno");
            Student s = new Student(id,name,age,birthday,location,classno);
            list.add(s);
        }
        return list;
    }

    //新增一条数据
    public static int addOne(Student s) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/2021dly", "root", "123456");
        //Statement statement = connection.createStatement();
        //获取预编译对象PreparedStatement
        String sql=
                "insert into student(name,age,birthday,location,classno) values(?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        //对?进行赋值
        ps.setString(1,s.getName());
        ps.setInt(2,s.getAge());
        ps.setDate(3,new java.sql.Date(s.getBirthday().getTime()));
        ps.setString(4,s.getLocation());
        ps.setInt(5,s.getClassno());
        //增删改全用excuteUpdate()方法执行
        return ps.executeUpdate();
    }
}