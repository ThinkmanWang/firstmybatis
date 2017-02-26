package com.thinkman.mybatistest.controllers;

import com.google.gson.Gson;
import com.thinkman.mybatistest.mapper.UserMapper;
import com.thinkman.mybatistest.RetObject;
import com.thinkman.mybatistest.models.User;
import org.apache.log4j.Logger;
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

    private Logger logger = Logger.getLogger(UserController.class);

    @RequestMapping(value="/login.do", method={RequestMethod.POST, RequestMethod.GET})
    public String login(HttpServletRequest request) {

        String name = request.getParameter("username");
        String pass = request.getParameter("password");

        logger.info(String.format("User Login user_name: %s, password: %s", name, pass));

        org.apache.ibatis.logging.LogFactory.useLog4JLogging();
        User user = mUserMapper.login(name, pass);

        RetObject ret = new RetObject();
        ret.code = 0;
        ret.message = "success";
        if (null != user) {
            ret.data = new Gson().toJson(user);
            logger.info("User not null");
        } else {
            logger.error("User is null");
        }

        return new Gson().toJson(ret);
    }
}
