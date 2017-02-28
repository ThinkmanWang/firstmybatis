package com.thinkman.mybatistest.service;

import org.apache.log4j.Logger;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class MQSampleTopicService1 {

	private Logger logger = Logger.getLogger(MQSampleTopicService1.class);

	@JmsListener(destination = "sample.topic")
	public void readMessage(String text) {
		logger.info(text);
	}

}
