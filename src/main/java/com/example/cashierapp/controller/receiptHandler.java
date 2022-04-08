package com.example.cashierapp.controller;

import com.example.cashierapp.model.cashierReceipt;
import com.example.cashierapp.model.supplyReceipt;

import java.sql.*;
import java.util.Vector;

public class receiptHandler {
    public static void addReceipt(int id, Vector<Integer> count, Vector<String> name) {
        Connection c = null;
        Statement s = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("");

            s = c.createStatement();
            String sql = "INSERT into Receipt (ReceiptId, ItemCount, ItemName) VALUES (" +
                         id + ", " + count + ", '" + name + "');";
            s.executeUpdate(sql);

            s.close();
            c.commit();
            c.close();
        } catch(SQLException | ClassNotFoundException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public static supplyReceipt getSupplyReceipt() {

    }

    public static cashierReceipt getCashierReceipt() {

    }
}
