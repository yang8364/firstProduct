package com.etoak.redis.queue;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
@Component
public class SendMessage {
	@Autowired
    private RedisTemplate<String, Object> redisTemplate;
	
	public void sendMessage(String channel , Serializable message){
		redisTemplate.convertAndSend(channel, message);
	}
}
