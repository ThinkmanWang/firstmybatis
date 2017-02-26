package com.thinkman.mybatistest.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangx on 2017-02-27.
 */
@RestController
@EnableAutoConfiguration
public class FirstController {
    @RequestMapping("/")
    public String hello() {
        return "hello,Spring boot!";
    }
}
