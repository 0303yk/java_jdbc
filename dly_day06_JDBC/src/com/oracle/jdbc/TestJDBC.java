package com.oracle.jdbc;
import java.sql.*;
public class TestJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.创建连接对象（Connection），让我们可以连接到指定的数据库
        String url="jdbc:mysql://localhost:3306/2021dly";//资源定位符
        String username="root";
        String password ="123456";
        Connection connection = DriverManager.getConnection(url, username, password);
        //3.通过链接对象创建Statement工具类（可以向数据库中传递sql语句）
        Statement statement=connection.createStatement();
        //4.执行相应sql语句后，得到结果
        String sql="select * from student";
        ResultSet resultSet =statement.executeQuery(sql);//
        //5.处理结果
        //System.out.println(resultSet.next());//判断结果中有没有结果

        while (resultSet.next()){
            int id=resultSet.getInt(1);
            String name=resultSet.getString(2);
            int age =resultSet.getInt(3);

            String location=resultSet.getString(4);
            Date birthday=resultSet.getDate(5);
            int classno =resultSet.getInt("classno");
            Student student =new Student(id,name,age,birthday,location,classno);
            System.out.println(student);
        }

        /*resultSet.next();
        int id=resultSet.getInt(1);
        String name=resultSet.getString(2);
        int age =resultSet.getInt(3);
        String location=resultSet.getString(4);
        Date birthday=resultSet.getDate(5);
        System.out.println(id+name+age+location+birthday);
        */
    }
}
