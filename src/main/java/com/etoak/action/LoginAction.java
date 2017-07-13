package com.etoak.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginAction {
	@RequestMapping("/loginPage")
	public String loginPage(){
		System.out.println("loginPage 执行了");
		return "login";
	}
	@ResponseBody  
	@RequestMapping("/logins")
	public List<String> login(){
		System.out.println("login 执行");
		List<String> list = new ArrayList<String>();
		list.add("etoak");
		return list;
	}
	
	
}
