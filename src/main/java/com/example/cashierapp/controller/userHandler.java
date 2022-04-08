package com.example.cashierapp.controller;

import com.example.cashierapp.model.user;

import java.sql.*;
import java.util.Vector;

public class userHandler {
    public static void addUser(String name, int id, String category, int password) {
        Connection c = null;
        Statement s = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("");
            c.setAutoCommit(false);

            s = c.createStatement();
            String sql = "INSERT into User (UserId, Category, Password, UserName) " +
                         "VALUES (" + id + ", " + category + ", " + password + ", '" + name + "' , " + ");";
            s.executeUpdate(sql);
            s.close();
            c.commit();
            c.close();
        } catch(SQLException | ClassNotFoundException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public static void updateUser(int id, int newPass) {
        Connection c = null;
        Statement s = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("");
            c.setAutoCommit(false);

            s = c.createStatement();
            String sql = "UPDATE User SET Password = "+ newPass + " WHERE UserId = " + id + ";";
            s.executeUpdate(sql);

            s.close();
            c.commit();
            c.close();
        } catch(SQLException | ClassNotFoundException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public static void deleteUser(int id) {
        Connection c = null;
        Statement s = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("");
            c.setAutoCommit(false);

            s = c.createStatement();
            String sql = "DELETE  from User WHERE UserId = " + id + ";";
            s.executeUpdate(sql);

            s.close();
            c.commit();
            c.close();
        } catch(SQLException | ClassNotFoundException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public Vector<user> getAllUser(String str) {
        Vector<user> us = new Vector<user>();
        Connection c = null;
        Statement s = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("");
            c.setAutoCommit(false);

            s = c.createStatement();
            String sql = "SELECT * FROM User WHERE Category = '" + str + "';";
            ResultSet r = s.executeQuery(sql);

            while(r.next()) {
                String name = r.getString("UserName");
                int pass = r.getInt("Password");
                int id = r.getInt("UserId");
                user x = new user(name, str, pass, id);
                us.add(x);
            }
        } catch(SQLException | ClassNotFoundException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return us;
    }

    public Vector<user> getAllCashier() {
        return getAllUser("Cashier");
    }

    public Vector<user> getAllAdmin() {
        return getAllUser("Admin");
    }
}
