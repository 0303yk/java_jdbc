package com.oracle.jdbctest;

import java.sql.*;
import java.util.Date;

public class busstest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/test";
        String username="root";
        String password="123456";
        Connection connection= DriverManager.getConnection(url,username,password);
        Statement statement=connection.createStatement();
        String sql="select * from emp";
        ResultSet resultSet=statement.executeQuery(sql);
        //使用while循环，输出表内容
        while (resultSet.next()){
//            int empno=resultSet.getInt("empno");//括号内填的是数据库中表的列名
//            System.out.println(empno);
            int empno=resultSet.getInt(1);
            String ename=resultSet.getString(2);
            String job=resultSet.getString(3);
            int mgr=resultSet.getInt(4);
            Date hiredate=resultSet.getDate(5);
            int sal=resultSet.getInt(6);
            int comm=resultSet.getInt(7);
            int deptno=resultSet.getInt(8);
            businessman b = new businessman(empno,ename,job,mgr,hiredate,sal,comm,deptno);
            System.out.println(b);
            //System.out.println(empno+","+ename+","+job+","+hiredate+","+sal+","+comm+","+deptno);

        }
    }
}
