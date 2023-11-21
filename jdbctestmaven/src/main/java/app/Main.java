package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import Connection.ConnectionDAO;

public class Main {
    public static void main(String[] args) {
        new ConnectionDAO().criaTabela();
    }
}