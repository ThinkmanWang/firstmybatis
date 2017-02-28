package com.thinkman.mybatistest.jms;

import com.thinkman.mybatistest.controllers.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class VerifyCodeQueueReceiver implements MessageListener {

	private org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(UserController.class);

	@Override
	public void onMessage(Message message) {

		try {
			String verifyInfoStr = ((TextMessage) message).getText();
			logger.info("Receive telephone number : " + verifyInfoStr);

		} catch (JMSException e) {
			logger.error("FXXK");
			e.printStackTrace();
		}
	}

}
