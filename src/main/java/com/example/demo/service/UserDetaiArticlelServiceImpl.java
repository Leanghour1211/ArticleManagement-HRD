package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



@Service
public class UserDetaiArticlelServiceImpl implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {		
		//TODO: retrieve user and roles from database
		User user = userRepository.loadUserByUsername(username);
		if(user == null) 
			throw new UsernameNotFoundException("not found!");
		System.out.println(user);
		return user;
	}

	
	
	
	
	
	
	
	
	
	
	
}
