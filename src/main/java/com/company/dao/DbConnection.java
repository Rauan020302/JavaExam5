package com.company.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "020302maks";

    public static Connection connect() {
        Connection conn = null;
        try {Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }return conn;
    }
}
