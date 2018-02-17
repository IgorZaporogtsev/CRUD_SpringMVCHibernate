package com.customer.store.security.services.security;


import com.customer.store.model.User;
import com.customer.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService implements UserDetailsService {

	@Autowired
	UserService userService;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userService.getUserByLogin(username);

		if (user == null) {
			throw new UsernameNotFoundException("Username " + username + " not found");
		}

		return  user;
	}
}
