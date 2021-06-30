package com.userservive.service;

import org.springframework.stereotype.Service;

import com.userservive.entity.User;
@Service
public interface UserService {
	public User getUser(int id);

}
