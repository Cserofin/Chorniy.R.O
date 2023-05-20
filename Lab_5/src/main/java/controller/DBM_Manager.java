package controller;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBM_Manager {
    private static Connection dbConnection;

    private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/java_database";
    private static final String DATABASE_USERNAME = "admin";
    private static final String DATABASE_PASSWORD = "password123";

    public static Connection getDBConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            if (dbConnection == null) {
                dbConnection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
            }
            return dbConnection;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}