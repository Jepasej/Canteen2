package org.example.canteen2.Foundation;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    static final String DATABASEURL = "jdbc:sqlserver://localhost;database=DBCanteen";
    static final String USERNAME = "sa";
    static final String PASSWORD = "123456";


    public static Connection getConnection() throws Exception
    {
        Connection conn = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection(DATABASEURL, USERNAME, PASSWORD);
        return conn;
    }

}
