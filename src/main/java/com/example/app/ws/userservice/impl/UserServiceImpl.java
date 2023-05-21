package com.example.app.ws.userservice.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.ws.shared.Utils;
import com.example.app.ws.ui.model.request.UserDetailsRequestModel;
import com.example.app.ws.ui.model.response.UserRest;
import com.example.app.ws.userservice.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	Map<String, UserRest> users;
	Utils utils;

	public UserServiceImpl() {
	}

	@Autowired
	public UserServiceImpl(Utils utils) {
		this.utils = utils;
	}
	
	@Override
	public UserRest getUser(String userId) {
		
		UserRest userRest = new UserRest();
		
		if (users.containsKey(userId)) {
			BeanUtils.copyProperties(users.get(userId), userRest);
		} else {
			userRest = null;
		}
		
		return userRest;
	}

	@Override
	public UserRest createUser(UserDetailsRequestModel userDetails) {
		
		UserRest userRest = new UserRest();
		userRest.setEmail(userDetails.getEmail());
		userRest.setFirstName(userDetails.getFirstName());
		userRest.setLastName(userDetails.getLastName());

		String userId = UUID.randomUUID().toString();
		userRest.setUserId(userId);

		if (users == null)
			users = new HashMap<>();

		users.put(userId, userRest);

		return userRest;
	}

}
