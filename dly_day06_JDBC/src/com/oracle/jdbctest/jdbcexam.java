package com.oracle.jdbctest;

import java.sql.*;

public class jdbcexam {
    public static void main(String[] args) throws SQLException {
        Driver driver = new com.mysql.jdbc.Driver();
        DriverManager.registerDriver(driver);
    }

}
