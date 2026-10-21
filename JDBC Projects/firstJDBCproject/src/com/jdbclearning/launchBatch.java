package com.jdbclearning;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
//Learning about the execution of batch update to update things in a batch, not one at a time.
public class launchBatch {
    public static void main(String[] args) {
        Connection connect=null;
        PreparedStatement preparedstatement=null;
        try {
            connect = jdbcUtil.getConnection();
            String query = "UPDATE studentinfo SET sage=? where id=?";
            //Using preparedStatement we don't need to add values as it is, we can enter then through the console.
            preparedstatement = connect.prepareStatement(query);

            preparedstatement.setInt(2, 1);
            preparedstatement.setInt(1, 22);
            preparedstatement.addBatch(); //Put the above in 2 statements in a batch and same goes to all the following updates
            preparedstatement.setInt(2, 2);
            preparedstatement.setInt(1, 20);
            preparedstatement.addBatch();
            preparedstatement.setInt(2, 3);
            preparedstatement.setInt(1, 25);
            preparedstatement.addBatch();
            preparedstatement.setInt(2, 4);
            preparedstatement.setInt(1, 21);
            preparedstatement.addBatch();

           preparedstatement.executeBatch(); //Executes all the batch at once and update all the things, its increase the overall performance
            //Using batch update we can perform multiple queries in one go.
            System.out.println("Check the DB for the results");
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
