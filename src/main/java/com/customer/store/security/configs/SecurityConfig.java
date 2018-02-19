package com.customer.store.security.configs;


import com.customer.store.security.handlers.CustomAuthenticationSuccessHandler;
import com.customer.store.security.services.security.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration      //Класс может обрабатываться контейнером Spring для генерации bean компонентов
@ComponentScan("com.customer.store")
@EnableWebSecurity  // интеграцию Spring Security с Spring MVC
@EnableGlobalMethodSecurity(prePostEnabled = true) 	//TODO
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private CustomAuthenticationSuccessHandler customAuthenticationSuccessHandler;


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		/* AuthenticationManagerBuilder - помощник конфигурации для быстрого получения функций
		 Authentication Manager, для настройки данных пользователя в памяти, JDBC или LDAP
		 или для добавления пользовательского UserDetailsService (хранилище пользователей)
		*/

		/*auth.inMemoryAuthentication()
                .withUser("user").password("user").roles("USER")
                .and()
                .withUser("admin").password("admin").roles("USER", "ADMIN");*/


        auth.userDetailsService(authenticationService);
    }


    // configure(HttpSecurity http) - Настройка безопасности http (сетевой)
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/user/**").hasAnyAuthority("USER")
                //.antMatchers("/user/**").hasRole("USER")
                .antMatchers("/admin/**").hasAnyAuthority("ADMIN")
                .and()
                .formLogin() //Указывает на поддержку проверки подлинности на основе форм.
               // .loginPage("/")
                .successHandler(customAuthenticationSuccessHandler)
                .usernameParameter("username")
                .passwordParameter("password");
    }
}
