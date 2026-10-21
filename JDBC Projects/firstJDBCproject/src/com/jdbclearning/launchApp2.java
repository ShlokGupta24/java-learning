package com.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class launchApp2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //Main setup in order to work with JDBC are as following:

        //Step 1: Import the req package in this case, MYSQL Connector is being installed and imported.

        //Step 2:Load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver"); //Load the implementing class from the db vendor in the driver.

        //Step 3:Establishing the connection
        String url="jdbc:mysql://localhost:3306/jdbclearning";
        String user="root";
        String password="/24june2005/";
        Connection connect= DriverManager.getConnection(url, user, password); //To connect with DB using Connection object

        //Step 4:Creating the statement
        Statement statement=connect.createStatement(); //Getting the statement in Statement object

        //Step 5:Execute the query
        //Updating the query to change the age from 18 to 24 of id=2 student.
        String sql="UPDATE studentinfo set sage=24 where id=2";
        int rowAffected=statement.executeUpdate(sql);
        //Step 6:Process the result
        if(rowAffected==0)
        {
            System.out.println("Updation failed");
        }
        else {
            System.out.println("Data updated Successfully.");
        }
        //Step 7:Close the resources
        statement.close();
        connect.close();
    }
}
