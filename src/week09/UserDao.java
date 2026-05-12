package week09;

import java.sql.*;

public class UserDao {
    private static Connection connection;

    public void initialize(){
        try {
            this.connection = DriverManager.getConnection("jdbc:sqlite:demo.db");
            Statement statement = connection.createStatement();

            // Execute the statement.
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS appusers (" +
                    "id INT NOT NULL," +
                    "username VARCHAR(20) NOT NULL," +
                    "password VARCHAR(20) NOT NULL," +
                    "PRIMARY KEY (id)" +
                    ")");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean findUser(String username, String password) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "select * from appusers where username = ? and password = ?");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
