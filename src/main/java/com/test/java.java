package com.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etoak.factory.Factory;
import com.etoak.factory.ForFactoryInterface;

@Controller
public class java {
	
	/*@Autowired
	private UserService userService;
*/
	@RequestMapping("/test")
	public String test(HttpServletRequest request){
		 //jdbcTemplate.execute("INSERT into mytest (name) VALUES('yang');");
		/*User user = userService.getUserById(1);
		System.out.println("执行了~~~"+ user.getUserName());
		request.setAttribute("userName", user.getUserName());
		return "test";*/
		
		System.out.println(request.getAttribute("etoak"));
		
		ForFactoryInterface tf = Factory.getFactory("test2");
		System.out.println(tf.getSign());
		
		return "myCode";
	}
	
}
