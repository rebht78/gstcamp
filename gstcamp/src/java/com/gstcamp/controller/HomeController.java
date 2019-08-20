/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gstcamp.controller;

import com.gstcamp.service.HomeService;
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
@RequestMapping("home.gst")
public class HomeController {

    @Autowired
    HomeService homeService;

    @RequestMapping(method = RequestMethod.POST, params = "action=showHome")
    public String getLoginPage(HttpServletRequest request, HttpServletResponse response) {
        return "home/Main";
    }

    @RequestMapping(method = RequestMethod.GET, params = "action=showClient")
    public ModelAndView getClientPage(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("home/Client");
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET, params = "action=addClient")
    public ModelAndView addClient(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("home/ClientView");
        modelAndView.addObject("process", "add");
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET, params = "action=editClient")
    public ModelAndView editClient(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("home/ClientView");
        modelAndView.addObject("process", "Edit");
        modelAndView.addObject("gstlist", homeService.getGSTList());
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET, params = "action=deleteClient")
    public ModelAndView deleteClient(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("home/ClientView");
        modelAndView.addObject("process", "Delete");
        modelAndView.addObject("gstlist", homeService.getGSTList());
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET, params = "action=viewClient")
    public ModelAndView viewClient(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("home/ClientView");
        modelAndView.addObject("process", "View");
        modelAndView.addObject("clientlist", homeService.showClient());
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET, params = "action=displayClient")
    public ModelAndView showClient(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("home/ClientView");
        modelAndView.addObject("process", "displayclient");
        modelAndView.addObject("clientlist", homeService.showClient());
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET, params = "action=showProduct")
    public ModelAndView getProductPage(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("home/Product");
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET, params = "action=showPurchase")
    public ModelAndView getPurchasePage(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("home/Purchase");
        return modelAndView;
    }
}
