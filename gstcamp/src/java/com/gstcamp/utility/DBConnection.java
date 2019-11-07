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

    static String url = "jdbc:mysql://localhost/gstcamp";
    static String username = "root";
    static String password = "";
    Connection con = null;

    public Connection getConnection() {
        System.out.println("in get connection con is "+con);
        try {
            if (con == null) {
                con = DriverManager.getConnection(url, username, password);
                System.out.println("in connection : " + con);
            }
            return con;
        } catch (SQLException ex) {
            System.out.println("SQL Exception : " + ex);
            return null;
        }
    }
}
