package com.thinkman.mybatistest.controllers;

import com.google.gson.Gson;
import com.thinkman.mybatistest.models.RetObject;
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

        String name = request.getParameter("username");
        String pass = request.getParameter("password");



        RetObject ret = new RetObject();
        ret.code = 0;
        ret.message = "success";

        return new Gson().toJson(ret);
    }
}
