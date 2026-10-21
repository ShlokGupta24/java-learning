package com.jdbclearning;

import java.sql.*;
import java.util.Scanner;

//In this we use prepareStatement instead of createStatement method that we use previously
public class launchApp7 {
    public static void main(String[] args) {
        Connection connect=null;
        PreparedStatement preparedstatement=null;
        try {
            connect = jdbcUtil.getConnection();
            String query = "INSERT INTO studentinfo(id, sname, sage, scity) VALUES(?,?,?,?)";
            //Using preparedStatement we don't need to add values as it is, we can enter then through the console.
            preparedstatement = connect.prepareStatement(query);

            System.out.println("Please enter the following details in DB:");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id:");
            int id = sc.nextInt();
            System.out.println("Enter student's name:");
            String name = sc.next();
            System.out.println("Enter student's age:");
            int age = sc.nextInt();
            System.out.println("Enter student's city:");
            String city = sc.next();

            preparedstatement.setInt(1, id);
            preparedstatement.setString(2, name);
            preparedstatement.setInt(3, age);
            preparedstatement.setString(4, city);


            int rowAffected = preparedstatement.executeUpdate();

            //Step 6:Process the result
            if (rowAffected == 0) {
                System.out.println("Unable to insert data.");
            } else {
                System.out.println("Data inserted Successfully.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            connect.close();
            preparedstatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
