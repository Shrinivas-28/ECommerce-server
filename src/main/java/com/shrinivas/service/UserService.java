package com.shrinivas.service;

import java.util.List;

import com.shrinivas.exception.UserException;
import com.shrinivas.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
