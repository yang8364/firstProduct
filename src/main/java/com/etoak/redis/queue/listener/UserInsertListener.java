package com.etoak.redis.queue.listener;

import java.io.Serializable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.etoak.pojo.User;
import com.etoak.service.UserService;

public class UserInsertListener {
	
	private static Log log = LogFactory.getLog(UserInsertListener.class);
	
	@Autowired
	private UserService userService;
	
	public void handleMessage(Serializable message) {
		log.info("UserInsertListener start");
		User user = (User) message;
		System.out.println(user.getUserName());
		Integer count =  userService.saveUser(user, "add");
		System.out.println(count);

	}
}
