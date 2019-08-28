/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gstcamp.serviceimpl;

import com.gstcamp.bean.LoginBean;
import com.gstcamp.repository.LoginRepository;
import com.gstcamp.service.LoginService;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aziz
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginRepository loginRepository;
    
    @Override
    public List checkLogin(LoginBean loginBean) throws SQLException{
        return loginRepository.checkLogin(loginBean);
    }
    
}
