package com.jdbclearning;

import java.sql.*;

public class launchApp3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
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
        //Retrive the data from sql to java application
        String sql="SELECT * FROM studentinfo";
        ResultSet rs=statement.executeQuery(sql); //We executeQuery instead of executeUpdate as we were only retriving the data, not updating them.
        //ResultSet important function use to fetch data store it in forms of tables or rows and columns and return datatype of executeQuery is ResultSet.

        //Step 6:Process the result
        while(rs.next()) //rs.next() moves to next row each time and returns true if there is any row otherwise false if there is no next row.
        {
          //  int id=rs.getInt(1); //fetch integer data from column one which is id and store it in id variable.
           // System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
            System.out.println(rs.getInt("id")+" "+rs.getString("sname")+" "+rs.getInt("sage")+" "+rs.getString("scity")); //Using column label instead of number

        }
        //Step 7:Close the resources
        rs.close();
        statement.close();
        connect.close();
    }
}
