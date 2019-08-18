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
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author aziz
 */
@Controller
@RequestMapping("product.gst")
public class ProductController {
    
    @RequestMapping(method = RequestMethod.GET, params = "action=addProduct")
    public ModelAndView addClient(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("product/ProductView");
        modelAndView.addObject("process", "add");
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET, params = "action=editProduct")
    public ModelAndView editClient(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("product/ProductView");
        modelAndView.addObject("process", "Edit");
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET, params = "action=deleteProdut")
    public ModelAndView deleteClient(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("product/ProductView");
        modelAndView.addObject("process", "Delete");
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET, params = "action=viewProduct")
    public ModelAndView viewClient(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("product/ProductView");
        modelAndView.addObject("process", "View");
        return modelAndView;
    }

}
