package com.jdbclearning;
//This is utility file, in which we can write all the boilerplate code and can reuse wherever we want.
//Now we can reuse these codes in our app for jdbc by just mentioning the class name.
import java.sql.*;

public class jdbcUtil {
    static{
        //Load and register the driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnection() throws SQLException {
        //Establishing the connection
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "/24june2005/";
        return DriverManager.getConnection(url, user, password);
    }
    public static void closeConnection(Connection connect, Statement statement) throws SQLException {
        statement.close();
        connect.close();
    }
}
