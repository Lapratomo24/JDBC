package com.wildcodeschool.myProject;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/jdbc","root","Adspree24#"
            );
            Statement stmt = con.createStatement();

            // add
            var preparedStatement = con.prepareStatement( "INSERT INTO person ( firstname, lastname, age) VALUES ( ?, ?, ? )");
            preparedStatement.setString(1, "David" );
            preparedStatement.setString(2, "Beckham" );
            preparedStatement.setInt(3, 44 );
            preparedStatement.execute();

            // update
            var updateStatement = con.prepareStatement("UPDATE person SET lastname=? WHERE lastname=?");
            updateStatement.setString(1,"Connor");
            updateStatement.setString(2,"Conner");
            updateStatement.execute();

            // delete
            var deleteStatement = con.prepareStatement("DELETE FROM person WHERE firstname=?");
            deleteStatement.setString(1, "John");
            deleteStatement.execute();

            ResultSet rs = stmt.executeQuery("select * from person");

            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getInt(3));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
