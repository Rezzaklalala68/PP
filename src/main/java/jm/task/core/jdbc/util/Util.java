package jm.task.core.jdbc.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/some";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "root";
    public static Connection getConnection() throws SQLException  {

        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

}
