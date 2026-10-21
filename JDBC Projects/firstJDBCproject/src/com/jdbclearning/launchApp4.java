package com.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class launchApp4 {
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
        //Rest everything will be same, now we learn to deleting the data from the database.
        String sql="DELETE FROM studentinfo where id=2"; //from studentinfo table id=2 will be deleted, if we do not write 'where' condition then its delete all data.
        int rowAffected=statement.executeUpdate(sql);
        //Step 6:Process the result
        if(rowAffected==0)
        {
            System.out.println("Failed to delete the record.");
        }
        else {
            System.out.println("Record deleted Successfully.");
        }
        //Step 7:Close the resources
        statement.close();
        connect.close();
    }
}
