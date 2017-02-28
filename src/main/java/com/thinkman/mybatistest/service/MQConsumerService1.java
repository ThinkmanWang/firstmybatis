package com.thinkman.mybatistest.service;

import org.apache.log4j.Logger;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MQConsumerService1 {

	private String text;

	private Logger logger = Logger.getLogger(MQConsumerService1.class);

	@JmsListener(destination = "sample.queue")
	public void receiveQueue(String text) {
		this.text = text;
		logger.info(text);
	}

	public String receive() {
		return text;
	}
}
