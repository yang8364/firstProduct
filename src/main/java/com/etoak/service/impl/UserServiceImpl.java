package com.etoak.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etoak.dao.UserMapper;
import com.etoak.pojo.User;
import com.etoak.service.UserService;

/**
 * @author ych
 *
 */

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	/*@Autowired
	private RedisTemplate<String, Object> redisTemplate;*/
	
//	@Override
//	public List<User> getUserListPage(User user){
//		return userMapper.getUserListPage(user);
//	}
	
	@Override
	public List<User> getUserList(User user){
		return userMapper.getUserList(user);
	}
	
	@Override
	public User getUserById(int id){
		return userMapper.getUserById(id);
	}

	@Override
	public int saveUser(User user,String doWhat){
		if("add".equals(doWhat)){
			return userMapper.insertUser(user);
		}else if("edit".equals(doWhat)){
			userMapper.updateUser(user);
		}		
		return 0;
  	
	}
	
	@Override
	public void insertUserBatch(List<User> users){
		userMapper.insertUserBatch(users);
	}
	
	@Override
	public void deleteUser(int id){
		userMapper.deleteUser(id);
	}
	
}