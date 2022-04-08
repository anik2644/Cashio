module com.example.cashierapp {
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cashierapp to javafx.fxml;
    exports com.example.cashierapp;
    exports com.example.cashierapp.model;
    opens com.example.cashierapp.model to javafx.fxml;
    exports com.example.cashierapp.controller;
    opens com.example.cashierapp.controller to javafx.fxml;
}