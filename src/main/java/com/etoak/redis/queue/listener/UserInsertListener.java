package com.etoak.redis.queue.listener;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import com.etoak.pojo.User;
import com.etoak.service.UserService;

public class UserInsertListener {
	
	@Autowired
	private UserService userService;
	
	public void handleMessage(Serializable message) {
		User user = (User) message;
		System.out.println(user.getUserName());
		Integer count =  userService.saveUser(user, "add");
		System.out.println(count);

	}
}
