package com.example.cashierapp.model;

import com.example.cashierapp.model.receipt;
import javafx.util.Pair;

import java.util.Vector;

public class cashierReceipt extends receipt {
    private int customerMoney, exchange;
    public cashierReceipt() {
        super();
        customerMoney = 0;
        exchange = getTotalPrice() - customerMoney;
    }
    public cashierReceipt(int customerMoney, int totalPrice, Vector<Pair<item, Integer>> itemList) {
        super(totalPrice, itemList);
        this.customerMoney = customerMoney;
        exchange = totalPrice - customerMoney;
    }
}
