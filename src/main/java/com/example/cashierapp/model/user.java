package com.example.cashierapp.model;

public abstract class user {
    private String userName, category;
    private int password, userID;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getUserID() { return userID; }

    public void setUserID(int userID) { this.userID = userID; }

    public user() {
        userName = "";
        category = "";
        password = 12345678;
        userID = 0;
    }
    public user(String userName, String category, int password, int userID) {
        this.userName = userName;
        this.category = category;
        this.password = password;
        this.userID = userID;
    }
}
