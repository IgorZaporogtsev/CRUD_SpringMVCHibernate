package com.customer.store.security.handlers;

import com.customer.store.model.Role;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Service;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;
import java.util.Set;


@Service
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    /*AuthenticationSuccessHandler - для успешной аутентификации пользователя*/



    //private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();


    /*
     * Метод  onAuthenticationSuccess вызывается когда пользователь успешно прошел аутентификацию
     * Authentication представляет пользователя (Principal) с точки зрения Spring Security
     * */
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response,
                                        Authentication auth) throws IOException, ServletException {

        Set<String> roles = AuthorityUtils.authorityListToSet(auth.getAuthorities());

        if (roles.contains("ADMIN")) {
            response.sendRedirect("/admin");
        } else if (roles.contains("USER")) {
            response.sendRedirect("/user");
        }



        /*Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();

            *//**Если коллекция ролей у юзера содержит роль ADMIN - отправляет на url /admin*//*
        if (authorities.contains(new Role("ADMIN"))){
            redirectStrategy.sendRedirect(request, response, "/admin");
            *//** Если коллекция ролей у юзера не содержит роль ADMIN ,но содержит роль USER - отправляет на url /user                *//*
        } else if (authorities.contains(new Role("USER"))) {
            redirectStrategy.sendRedirect(request, response, "/user");
            *//** Если не содержит ни одну из указанных ролей - бросает исключение **//*
        } else {
            throw new IllegalStateException();
        }*/
    }


}
