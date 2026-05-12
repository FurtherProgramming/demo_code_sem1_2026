package week09;

import java.sql.*;

public class CreateTableDemo {
    public static void main(String[] args) {
        // Establish a connection.
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:demo.db");
            // Create a statement.
            Statement statement = connection.createStatement();

            // Execute the statement.
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS users (" +
                    "id INT NOT NULL," +
                    "first_name VARCHAR(20) NOT NULL," +
                    "last_name VARCHAR(20) NOT NULL," +
                    "PRIMARY KEY (id)" +
                    ")");

//            statement.executeUpdate("insert into users values (111, 'Amy', 'Smith')");
//            statement.executeUpdate("insert into users values (112, 'Estrid', 'He')");
//            statement.executeUpdate("insert into users values (113, 'John', 'Smith')");
            ResultSet rs = statement.executeQuery("SELECT * FROM users where id = 111");
            while(rs.next()) {
                System.out.println(rs.getString(1) + "|" +
                        rs.getString(2) + "|" +
                        rs.getString(3));
            }



            // Process the ResultSet object.
            //Close the connection
            connection.close();
        }catch(SQLException exception){
            System.err.println("Something is wrong with the database connection.");
        }
    }
}
