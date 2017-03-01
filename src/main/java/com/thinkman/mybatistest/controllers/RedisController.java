package com.thinkman.mybatistest.controllers;

import com.thinkman.mybatistest.service.MQConsumerService;
import com.thinkman.mybatistest.service.MQProduceService;
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
		mStringRedisTemplate.opsForValue().set("aaa", "12345678");
		logger.info(mStringRedisTemplate.opsForValue().get("aaa"));

		return "success";
	}

}
