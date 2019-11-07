/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gstcamp.controller;

import com.gstcamp.bean.LoginBean;
import com.gstcamp.service.LoginService;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author aziz
 */
@Controller
@RequestMapping(value = "login.gst")
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(method = RequestMethod.GET, params = "action=login")
    public String getLoginPage(HttpServletRequest request, HttpServletResponse response) {
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST, params = "action=checkLogin")
    public ModelAndView checkLoginData(HttpServletRequest request, HttpServletResponse response, LoginBean loginBean) throws SQLException {
        ModelAndView modelAndView = new ModelAndView("process");
        List list = loginService.checkLogin(loginBean);
        modelAndView.addObject("rownum", list.size());
        return modelAndView;
    }
}
