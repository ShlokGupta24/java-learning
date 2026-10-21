package com.jdbclearning;

import java.sql.*;

//Till now, we were just throwing exception which is not the good way, we can write the code better using try and catch method blocks.
public class launchApp6 {
    public static void main(String[] args) { //See here we were throwing exception now we have deal with them.
        Statement statement=null;
        Connection connect=null;
        //Main setup in order to work with JDBC are as following:

        //Step 1: Import the req package in this case, MYSQL Connector is being installed and imported.

        //Step 2:Load and register the driver
        //Surrounding them with try and catch better way for exception handling that we also learn previously.
        try {
            //Load the implementing class from the db vendor in the driver.


            //Step 3:Establishing the connection

            connect = jdbcUtil.getConnection(); //To connect with DB using Connection object

            //Step 4:Creating the statement
            statement = connect.createStatement(); //Getting the statement in Statement object

            //Step 5:Execute the query
            //If we have to update something we use executeUpdate and if we have retrieve data we use executeQuery, but we can use both in one using execute method like in this.
            //String sql = "SELECT * FROM studentinfo";
             String sql="UPDATE studentinfo set sname='Karan' where id=3";
            boolean status = statement.execute(sql); //Execute method return type is boolean.
            //Its gives true when we use select or retrieving the data and false when we're updating the data.
            //Step 6:Process the result
            if (status) {
                //select
                ResultSet rs = statement.getResultSet();
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " " + rs.getString("sname") + " " + rs.getInt("sage") + " " + rs.getString("scity"));
                }
            } else {
                //insertion, deletion and update
                int rows = statement.getUpdateCount();
                if (rows == 0)
                    System.out.println("Operation not successful.");
                else
                    System.out.println("Operation is successful.");
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        //In try, code executes till it doesn't found exception after that it stops, so closing of resources does not get affected by it we use finally which means its executes, no matter what.
        finally{
            //Step 7:Close the resources
            try {

                jdbcUtil.closeConnection(connect,statement);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
