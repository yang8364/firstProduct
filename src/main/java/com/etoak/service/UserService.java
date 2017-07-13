package com.etoak.service;

import java.util.*;
import com.etoak.pojo.*;
/**
 * @author ych
 *
 */
public abstract interface UserService {
	
//	public abstract List<User> getUserListPage(User user);
	
	public abstract List<User> getUserList(User user);
	
	public abstract User getUserById(int id);
	
	public abstract int saveUser(User user,String doWhat);
	
	public abstract void insertUserBatch(List<User> users);

	public abstract void deleteUser(int id);
	
}