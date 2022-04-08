package com.example.cashierapp.model;

import javafx.util.Pair;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import java.util.Vector;

public abstract class receipt {
    private int totalPrice;
    private Date date;
    private Time time;
    private Vector<Pair<item, Integer>> itemList;

    public receipt() {
        totalPrice = 0;
        date = new Date();
        time = Time.valueOf(LocalTime.now());
        itemList = new Vector<Pair<item, Integer>>();
    }

    public receipt(int totalPrice, Vector<Pair<item, Integer>> itemList) {
        this.totalPrice = totalPrice;
        date = new Date();
        time = Time.valueOf(LocalTime.now());
        this.itemList = itemList;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() { return time; }
}
