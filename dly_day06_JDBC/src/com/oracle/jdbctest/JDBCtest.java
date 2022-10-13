package com.oracle.jdbctest;

import java.sql.*;


public class JDBCtest {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement s = null;
        ResultSet rs=null;

        try {
            //①注册驱动
            Driver driver = new com.mysql.jdbc.Driver();
            //oracle 需要Driver driver = new oracle.jdbc.driver.OracleDriver();
            DriverManager.registerDriver(driver);
            //②获取数据库连接
            String url = "jdbc:mysql://localhost:3306/test";
            //oracle是“oracle:jdbc:thin:@localhost:1521:test”
            String username = "root";
            String password = "123456";
            connection = DriverManager.getConnection(url, username, password);
            //System.out.println(connection);
            //③获取数据库对象
            s = connection.createStatement();
            //System.out.println(s);
            //通过一个statement连接对象可以创建多个statement对象
            //Statement s2 = connection.createStatement();
            //④执行sql语句
            //添加一行数据
            //String sql="insert into dept values ('50','Hr','zhong')";
            //String sql2="insert into dept values ('60','Worktime','lianghao')";
            //删除一行数据
            //String sql="delete  from dept where deptno='60'";
            //改动一条数据
            //String sql = "update dept set dname = 'RESTTIME', loc='GOOD' where deptno='50'";
            //int count = s.executeUpdate(sql);
            //System.out.println(count);
            //⑤处理查询结果集
            String sql="select empno,ename,sal from emp order by sal desc";
            rs=s.executeQuery(sql);
            while (rs.next()) {//作用是将光标下移一位，并返回boolean类型数据
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                double sal = rs.getDouble("sal");
                System.out.println(empno + "," + ename + "," + sal);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //⑥释放资源
            //先释放Statement，再释放Connection
            //分别进行try catch 处理
            if (s != null) {
                try {
                    s.close();
                } catch (SQLException e) {
                    e.printStackTrace();

                }
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                }
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                }
                }
            }

        }

    }
}