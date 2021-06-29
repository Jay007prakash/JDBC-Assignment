package com.sr.cgi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class InsertDemo {
    public static void main(String[] args) throws SQLException {
        Connection connection;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "JAY@1mahto");
        PreparedStatement psmt = connection.prepareStatement("insert into sales_rep(rep_id, name, city, commision) values(?,?,?,?)");

        psmt.setInt(1, 1008);
        psmt.setString(2, "Jay");
        psmt.setString(3, "Jharkhand");
        psmt.setDouble(4, 0.15);

        psmt.executeUpdate();






    }
}

