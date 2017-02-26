package com.thinkman.mybatistest.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wangx on 2017-02-27.
 */
@RestController
@EnableAutoConfiguration
public class UserController {
    @RequestMapping(value="/login.do", method={RequestMethod.POST, RequestMethod.GET})
    public String login(HttpServletRequest request) {

        String name = request.getParameter("name");
        String pass = request.getParameter("pass");

        return "success " + name;
    }
}
