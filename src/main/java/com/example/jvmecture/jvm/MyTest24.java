package com.example.jvmecture.jvm;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyTest24 {
    public static void main(String[] args) throws Exception {
        Class.forName("java.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test3", "root", "root");
    }
}
