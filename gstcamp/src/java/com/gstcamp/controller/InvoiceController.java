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
@RequestMapping("invoice.gst")
public class InvoiceController {
    @RequestMapping(method = RequestMethod.GET, params = "action=addPurchase")
    public ModelAndView addProduct(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("invoice/PurchaseView");
        modelAndView.addObject("process", "add");
        return modelAndView;
    }
}
