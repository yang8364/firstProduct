package com.etoak.redis.queue.listener;

import java.io.Serializable;

public class ListenMessage {
	public void handleMessage(Serializable message){
        System.out.println(message);
    }
}
