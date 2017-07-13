package com.test;  
  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.etoak.pojo.User;
import com.etoak.service.UserService;  
  
//@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类    
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
  
public class Testformy { 

    @Autowired
    private UserService userService;
    
//    @Test  
    public void test1() {  
        User user = userService.getUserById(1);  
        System.out.println(user.getUserName());  
    }
}
        
        
        