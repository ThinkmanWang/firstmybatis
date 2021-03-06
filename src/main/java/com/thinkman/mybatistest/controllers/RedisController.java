package com.thinkman.mybatistest.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

	@Autowired
	private StringRedisTemplate mStringRedisTemplate;

	private Logger logger = Logger.getLogger(UserController.class);


	@RequestMapping("/redis.do")
	public String redis() {
		mStringRedisTemplate.opsForValue().set("aaa", "1234567887654321");
		logger.info(mStringRedisTemplate.opsForValue().get("aaa"));

		return "success";
	}

}
