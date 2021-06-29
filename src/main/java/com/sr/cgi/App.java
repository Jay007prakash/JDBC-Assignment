package com.sr.cgi;

/**
 * Hello world!
 *
 */
import java.sql.*;
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        Connection connection;
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi","root","JAY@1mahto");
        System.out.println("Connection created"+connection);
        Statement stat=connection.createStatement();
        ResultSet resultset=stat.executeQuery("select * from sales_rep");
        while(resultset.next())
        {
            Integer id;
            id=resultset.getInt("rep_id");
            String name=resultset.getNString("name");
            String city=resultset.getNString("city");
            double com=resultset.getDouble("commision");
            System.out.println(id+" "+name+" "+city+" "+ com);
        }

    }
}
