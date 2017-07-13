package com.etoak.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etoak.factory.Factory;
import com.etoak.factory.ForFactoryInterface;

@Controller
public class TestFactoryAction {
	@RequestMapping("/factory")
	public String factory(){
		
		ForFactoryInterface tf = Factory.getFactory("test1");
		System.out.println(tf.getSign());
		
		return "success";
	}
}
