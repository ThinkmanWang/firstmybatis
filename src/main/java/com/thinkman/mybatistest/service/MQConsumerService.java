package com.thinkman.mybatistest.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MQConsumerService {

	private String text;

	@JmsListener(destination = "sample.queue")
	public void receiveQueue(String text) {
		this.text = text;
		System.out.println(text);
	}

	public String receive() {
		return text;
	}
}
