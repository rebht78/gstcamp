/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gstcamp.utility;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

/**
 *
 * @author aziz
 */
public class DBUtility implements DataUtility {
    
    @Override
    public List getList(String sql, SqlParameterSource sqlParameterSource) throws SQLException {
        Connection con = DBConnection.getConnection();
        DataSource dataSource = new SingleConnectionDataSource(con, true);
        NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        
        return jdbcTemplate.queryForList(sql, sqlParameterSource);
    }
    
}
