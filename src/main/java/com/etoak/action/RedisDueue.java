package com.etoak.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etoak.pojo.User;
import com.etoak.redis.queue.SendMessage;

@Controller
@RequestMapping("/redis")
public class RedisDueue {
	@Autowired
	private SendMessage sendMessage;

	@RequestMapping("test")
	public String regisTest() {
		
		for (int i = 0; i < 1000; i++) {
			sendMessage.sendMessage("java", i);
		}

		return "myCode";
	}
	@RequestMapping("addUser")
	public String addUser(){
		User user = new User();
		user.setAge(10);
		user.setUserName("etoak");
		user.setPassword("etoak123");
		sendMessage.sendMessage("userInsert", user);
		
		return "success";
	}
}
