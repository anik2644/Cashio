package com.example.cashierapp.model;

import javafx.util.Pair;

import java.util.Vector;

public class supplyReceipt extends receipt{
    public supplyReceipt() {
        super();
    }

    public supplyReceipt(int totalPrice, Vector<Pair<item, Integer>> itemList) {
        super(totalPrice, itemList);
    }

}
