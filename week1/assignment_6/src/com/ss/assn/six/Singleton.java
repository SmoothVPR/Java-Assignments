package com.ss.assn.six;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.math.BigDecimal;

public static class Singleton
{
    private static Singleton instance = null;
    private static Connection conn = null;

    public static Singleton getInstance()
    {
        // First check
        if (instance == null)
        {
            synchronized (Singleton.class)
            {
                // Second check
                if (instance == null)
                {
                    instance = new Singleton();
                }
            }
        }
 
        return instance;
    }

    public static Connection getConnection(String database)
    {
        // First check
        if (connection == null)
        {
            synchronized (Singleton.class)
            {
                // Second check
                if (connection == null)
                {
                    connection = new Singleton();
                }
            }
        }

        return connection;
    }
}
