/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gstcamp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author aziz
 */
@Controller
@RequestMapping("login.gst")
public class LoginController {
    
    @RequestMapping(method = RequestMethod.GET, params = "action=login")
    public String getLoginPage(HttpServletRequest request, HttpServletResponse response)
    {
        return "login";
    }
}
