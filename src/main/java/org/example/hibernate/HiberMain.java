package org.example.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HiberMain {
    public static void main(String[] args) throws SQLException {
        //Connection connection = getNewConnection();
        System.out.println("vii");
    }

    private static Connection getNewConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5433/postgres";
        String user = "postgres";
        String passwd = "123098";
        return DriverManager.getConnection(url, user, passwd);
    }
}
