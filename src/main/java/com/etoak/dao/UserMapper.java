package com.etoak.dao;

import java.util.*;
import com.etoak.pojo.*;
/**
 * @author ych
 *
 */
public abstract interface UserMapper {
	
//	public abstract List<User> getUserListPage(User user);
	
	public abstract List<User> getUserList(User user);
	
	public abstract User getUserById(int id);

	public abstract int insertUser(User user);
	
	public abstract void insertUserBatch(List<User> users);

	public abstract void updateUser(User user);

	public abstract void deleteUser(int id);
	
}
