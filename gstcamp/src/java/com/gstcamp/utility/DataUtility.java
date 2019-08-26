/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gstcamp.utility;

import java.util.List;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import java.sql.SQLException;

/**
 *
 * @author aziz
 */
public interface DataUtility {
   
    List getList(String sql, SqlParameterSource sqlParameterSource) throws SQLException;
}
