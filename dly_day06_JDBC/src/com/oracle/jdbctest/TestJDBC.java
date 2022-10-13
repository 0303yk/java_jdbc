/*package com.oracle.jdbctest;

import com.oracle.jdbc.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestJDBC {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        List<businessman> list=findAll();
    }
    public static List<businessman> findAll() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        //2.创建连接对象（Connection），让我们可以连接到指定的数据库
        String url = "jdbc:mysql://localhost:3306/2021dly";//资源定位符
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, username, password);
        //3.通过链接对象创建Statement工具类（可以向数据库中传递sql语句）
        Statement statement = connection.createStatement();
        //4.执行相应sql语句后，得到结果
        String sql = "select * from emp";
        ResultSet resultSet = statement.executeQuery(sql);
        List<businessman> list = new ArrayList<>();
        while (resultSet.next()) {
            int empno = resultSet.getInt(1);
            String ename = resultSet.getString(2);
            String job = resultSet.getString(3);
            int mgr = resultSet.getInt(4);
            Date hiredate = resultSet.getDate(5);
            int sal = resultSet.getInt(6);
            int comm = resultSet.getInt(7);
            int deptno = resultSet.getInt(8);
            businessman s = new businessman(empno, ename, job, mgr, hiredate, sal, comm, deptno);
            System.out.println(student);
            list.add(s);
        }
        return list;
    }
*/