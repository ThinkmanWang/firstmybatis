package com.thinkman.mybatistest.jms;


import com.thinkman.mybatistest.controllers.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class TelephoneNumQueueReceiver implements MessageListener {

	private org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(UserController.class);

	@Override
	public void onMessage(Message message) {

		try {
			String userInfoStr = ((TextMessage) message).getText();
			logger.info("Receive telephone number : " + userInfoStr);

		} catch (JMSException e) {
			logger.error("FXXK");

			e.printStackTrace();
		}
	}

}
