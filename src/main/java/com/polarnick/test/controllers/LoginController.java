package com.polarnick.test.controllers;

import com.polarnick.test.entities.User;
import com.polarnick.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Polyarnyi Nikolay
 */
@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/secure/hello", method = RequestMethod.GET)
    public ModelAndView hello() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.getUser(auth.getName());

        ModelAndView model = new ModelAndView("/secure/hello");
        model.addObject("user", user);
        return model;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView model = new ModelAndView("/public/home");
        model.addObject("message", "Hello!");
        return model;
    }

}