package com.feedback;
import java.sql.*;

public class DBConnection {
    private static Connection conn;

    public static Connection getConnection() throws Exception {
        if (conn == null || conn.isClosed()) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/feedback_db",
                "root",        
                "yourpassword" 
                );
        }
        return conn;
    }
}
