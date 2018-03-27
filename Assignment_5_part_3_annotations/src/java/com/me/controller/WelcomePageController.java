/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author nanaj
 */
@Controller
@RequestMapping("/welcomepage")
public class WelcomePageController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView welcome(HttpServletRequest request) throws Exception {
        
        return new ModelAndView("welcomepage");
    }
}