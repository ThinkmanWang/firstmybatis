package com.thinkman.mybatistest.service;

import com.thinkman.mybatistest.controllers.UserController;
import org.apache.log4j.Logger;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MQConsumerService {

	private String text;

	private Logger logger = Logger.getLogger(MQConsumerService.class);

	@JmsListener(destination = "sample.queue")
	public void receiveQueue(String text) {
		this.text = text;
		logger.info(text);
	}

	public String receive() {
		return text;
	}
}
