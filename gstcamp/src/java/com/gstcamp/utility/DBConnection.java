/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gstcamp.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aziz
 */
public class DBConnection {

    static String url = "jdbc:mysql://localhost:8012/gstcamp";
    static String username = "root";
    static String password = "";
    static Connection con = null;

    public static Connection getConnection() throws SQLException {
        if (con == null) {
            con = DriverManager.getConnection(url, username, password);
        }
        return con;
    }
}
