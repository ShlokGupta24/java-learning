package com.jdbclearning;

import java.sql.*;

public class launchApp5 {
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
    //If we have to update something we use executeUpdate and if we have retrieve data we use executeQuery, but we can use both in one using execute method like in this.
    String sql="SELECT * FROM studentinfo";
      //  String sql="UPDATE studentinfo set sage=16 where id=1";
    boolean status =statement.execute(sql); //Execute method return type is boolean.
        //Its gives true when we use select or retrieving the data and false when we're updating the data.
    //Step 6:Process the result
    if(status)
    {
        //select
        ResultSet rs=statement.getResultSet();
        while(rs.next()){
            System.out.println(rs.getInt("id")+" "+rs.getString("sname")+" "+rs.getInt("sage")+" "+rs.getString("scity"));
        }
    }
    else {
        //insertion, deletion and update
        int rows=statement.getUpdateCount();
        if(rows==0)
            System.out.println("Operation not successful.");
        else
            System.out.println("Operation is successful.");
    }
    //Step 7:Close the resources
    statement.close();
    connect.close();
}
}
