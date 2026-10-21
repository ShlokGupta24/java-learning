package com.jdbclearning;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class launchApp8 {
    public static void main(String[] args) {
        Connection connect=null;
        PreparedStatement preparedstatement=null;
        try {
            connect = jdbcUtil.getConnection();
            String query = "UPDATE studentinfo SET sage=? where id=?";
            //Using preparedStatement we don't need to add values as it is, we can enter then through the console.
            preparedstatement = connect.prepareStatement(query);

            System.out.println("Please enter the details for update:");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id in which update is needed:");
            int id = sc.nextInt();
            System.out.println("Enter the updated age:");
            int age = sc.nextInt();

            preparedstatement.setInt(2, id);
            preparedstatement.setInt(1, age);

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
