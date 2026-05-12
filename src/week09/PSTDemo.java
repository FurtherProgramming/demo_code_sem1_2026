package week09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PSTDemo {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:demo.db");
            PreparedStatement statement = connection.prepareStatement("insert into users values (?, ?, ?)");

            int[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            for(int ID : IDs) {
                statement.setInt(1, ID);
                statement.setString(2, "Amy");
                statement.setString(3, "Smith");
                statement.executeUpdate();
            }


        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
