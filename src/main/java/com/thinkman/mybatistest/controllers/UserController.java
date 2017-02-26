package com.thinkman.mybatistest.controllers;

import com.google.gson.Gson;
import com.thinkman.mybatistest.mapper.UserMapper;
import com.thinkman.mybatistest.models.RetObject;
import com.thinkman.mybatistest.models.User;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private UserMapper mUserMapper;


    @RequestMapping(value="/login.do", method={RequestMethod.POST, RequestMethod.GET})
    public String login(HttpServletRequest request) {

        String name = request.getParameter("username");
        String pass = request.getParameter("password");

        User user = mUserMapper.login(name, pass);

        RetObject ret = new RetObject();
        ret.code = 0;
        ret.message = "success";
        if (null != user) {
            ret.data = new Gson().toJson(user);
        }

        return new Gson().toJson(ret);
    }
}
