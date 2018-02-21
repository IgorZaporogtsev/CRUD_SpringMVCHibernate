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

	/*

попадаем в метод loadUserByUsername после того как ввели в форму логин/пароль

UserDetailsService, используется чтобы создать UserDetails объект путем реализации единственного метода этого интерфейса
Метод loadUserByUsername позволяет получить из источника данных (базы данных) объект пользователя и сформировать из него объект UserDetails
который будет использоваться контекстом Spring Security.
*/



	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		User user = userService.getUserByLogin(login);
		if (user == null) {
			throw new UsernameNotFoundException("Login " + login + " not found");
		}
		return user;
	}
}
