package com.example.app.ws.userservice;

import com.example.app.ws.ui.model.request.UserDetailsRequestModel;
import com.example.app.ws.ui.model.response.UserRest;

public interface UserService {
	
	UserRest getUser(String userId);
	
	UserRest createUser(UserDetailsRequestModel userDetails);
}
