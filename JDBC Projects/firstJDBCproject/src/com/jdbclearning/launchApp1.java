package com.jdbclearning;
import java.sql.*;
public class launchApp1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //Main setup in order to work with JDBC are as following:

        //Step 1: Import the req package in this case, MYSQL Connector is being installed and imported.

        //Step 2:Load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver"); //Load the implementing class from the db vendor in the driver.

        //Step 3:Establishing the connection
        String url="jdbc:mysql://localhost:3306/jdbclearning";
        String user="root";
        String password="/24june2005/";
        Connection connect=DriverManager.getConnection(url, user, password); //To connect with DB using Connection object

        //Step 4:Creating the statement
        Statement statement=connect.createStatement(); //Getting the statement in Statement object

        //Step 5:Execute the query
        //String sql="INSERT INTO studentinfo(id, sname, sage, scity) VALUES(1, 'Rohan', 17, 'Bengaluru')";
        String sql="INSERT INTO studentinfo(id, sname, sage, scity) VALUES(3, 'Rohit', 17, 'Pune')"; //Inserting the data

        int rowAffected=statement.executeUpdate(sql);

        //Step 6:Process the result
        if(rowAffected==0)
        {
            System.out.println("Unable to insert data.");
        }
        else {
            System.out.println("Data inserted Successfully.");
        }
        //Step 7:Close the resources
        statement.close();
        connect.close();
    }
}
