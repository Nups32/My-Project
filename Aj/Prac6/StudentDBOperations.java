import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
import java.sql.Statement;  

public class StudentDBOperations {  
    private static final String URL = "jdbc:mysql://localhost:3306/";  
    private static final String USER = "root";  
    private static final String PASSWORD = "nupur";  // Replace with your MySQL root password  

    public static void main(String[] args) {  
        Connection connection = null;  

        try {  
            // Step 1: Connect to MySQL  
            connection = DriverManager.getConnection(URL, USER, PASSWORD);  
            System.out.println("Connected to MySQL Database!");  
        
            // Step 2: Create Database  
            createDatabase(connection);  
            // Step 3: Create Table  
            createTable(connection);  
            // Step 4: Insert Records  
            insertRecords(connection);  
            // Step 5: Update Records  
            updateRecords(connection);  
            // Step 6: Delete Records  
            deleteRecords(connection);  
            // Step 7: Drop Table  
            dropTable(connection);  
            // Step 8: Drop Database  
            dropDatabase(connection);  

        } catch (SQLException e) {  
            e.printStackTrace();  
        } finally {  
            try {  
                if (connection != null) connection.close();  
            } catch (SQLException e) {  
                e.printStackTrace();  
            }  
        }  
    }  

    private static void createDatabase(Connection connection) {  
        try (Statement statement = connection.createStatement()) {  
            String sql = "CREATE DATABASE StudentDB";  
            statement.executeUpdate(sql);  
            System.out.println("Database 'StudentDB' created successfully.");  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    }  

    private static void createTable(Connection connection) {  
        try (Statement statement = connection.createStatement()) {  
            connection.setCatalog("StudentDB");  
            String sql = "CREATE TABLE Student (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), age INT, grade VARCHAR(50))";  
            statement.executeUpdate(sql);  
            System.out.println("Table 'Student' created successfully.");  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    }  

    private static void insertRecords(Connection connection) {  
        try (Statement statement = connection.createStatement()) {  
            // Replacing 'Alice' with 'Nupur' and 'Bob' with 'Diya'  
            String sql1 = "INSERT INTO Student (name, age, grade) VALUES ('Nupur', 20, 'A')";  
            String sql2 = "INSERT INTO Student (name, age, grade) VALUES ('Diya', 21, 'B')";  
            statement.executeUpdate(sql1);  
            statement.executeUpdate(sql2);  
            System.out.println("Records inserted successfully into 'Student' table.");  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    }  

    private static void updateRecords(Connection connection) {  
        try (Statement statement = connection.createStatement()) {  
            // Updating Diya's grade instead of Bob's  
            String sql = "UPDATE Student SET grade='A+' WHERE name='Diya'";  
            statement.executeUpdate(sql);  
            System.out.println("Record updated successfully in 'Student' table.");  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    }  

    private static void deleteRecords(Connection connection) {  
        try (Statement statement = connection.createStatement()) {  
            // Deleting Nupur's record instead of Alice's  
            String sql = "DELETE FROM Student WHERE name='Nupur'";  
            statement.executeUpdate(sql);  
            System.out.println("Record deleted successfully from 'Student' table.");  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    }  

    private static void dropTable(Connection connection) {  
        try (Statement statement = connection.createStatement()) {  
            String sql = "DROP TABLE Student";  
            statement.executeUpdate(sql);  
            System.out.println("Table 'Student' dropped successfully.");  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    }  

    private static void dropDatabase(Connection connection) {  
        try (Statement statement = connection.createStatement()) {  
            statement.executeUpdate("DROP DATABASE StudentDB");  
            System.out.println("Database 'StudentDB' dropped successfully.");  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    }  
}  