package com.thinkman.mybatistest.controllers;

import com.thinkman.mybatistest.service.MQConsumerService;
import com.thinkman.mybatistest.service.MQProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MQController {

	@Autowired
	private MQProduceService produceService;

	@Autowired
	private MQConsumerService consumerService;

	@RequestMapping("/send")
	public String send() {
		produceService.send("this is an activemq message fxxk");
		return "send";
	}
	
	@RequestMapping("/receive")
	public String receive() {
		String str = consumerService.receive();
		return str;
	}
}
