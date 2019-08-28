/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gstcamp.service;

import com.gstcamp.bean.LoginBean;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author aziz
 */
public interface LoginService {
    List checkLogin(LoginBean loginBean) throws SQLException;
}
