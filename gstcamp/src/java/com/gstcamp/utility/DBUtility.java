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
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

/**
 *
 * @author aziz
 */
public class DBUtility implements DataUtility {

    @Override
    public List getList(String sql, SqlParameterSource sqlParameterSource) {
        System.out.println("in db utility");
        try {
            Connection con = new DBConnection().getConnection();
            System.out.println("after connection : "+con);
            DataSource dataSource = new SingleConnectionDataSource(con, true);
            NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
            return jdbcTemplate.queryForList(sql, sqlParameterSource);
        } catch (DataAccessException  ex) {
            System.out.println("Exception : " + ex);
            return null;
        }
    }

}
