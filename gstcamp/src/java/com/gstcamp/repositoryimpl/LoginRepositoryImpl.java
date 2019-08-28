/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gstcamp.repositoryimpl;

import com.gstcamp.bean.LoginBean;
import com.gstcamp.repository.LoginRepository;
import com.gstcamp.utility.DBUtility;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.stereotype.Repository;

/**
 *
 * @author aziz
 */
@Repository
public class LoginRepositoryImpl implements LoginRepository {

    DBUtility dBUtility = new DBUtility();
    @Override
    public List checkLogin(LoginBean loginBean) throws SQLException {
        String sql = "select username from login where username = :username and password = :password;";
        
        return dBUtility.getList(sql, new BeanPropertySqlParameterSource(loginBean));
    }
    
}
