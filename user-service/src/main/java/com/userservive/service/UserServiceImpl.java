package com.userservive.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.userservive.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	private static List<User> list = new ArrayList<User>();
			static {
			list.add(new User(1123,"Shivani","6789054"));
			list.add(new User(1124,"Shiva","678954"));
			list.add(new User(1125,"Shivangi","67894"));
			list.add(new User(1126,"Shivanshu","678954"));
			}
					
		

	@Override
	public User getUser(int id) {
		return list.stream().filter(user->user.getUserId()==(id)).findAny().orElse(null);
	}
	

}
