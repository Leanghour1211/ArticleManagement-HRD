package com.example.demo.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class CustomSuccessHandler implements AuthenticationSuccessHandler{

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		
		System.out.println("Successfully! logged in");
		
		String redirectUrl = (String) request.getSession().getAttribute("REDIRECT_URL");
		if(redirectUrl != null){
			response.sendRedirect(redirectUrl);
			return;
		}
		
		for(GrantedAuthority authority:authentication.getAuthorities()){
			
			System.out.println(authority.getAuthority());
			if(authority.getAuthority().equals("ROLE_ADMIN"))
				redirectUrl = "/articles";
			
			
			
			else if(authority.getAuthority().equals("ROLE_USER"))
				redirectUrl = "/articles/filter/";
			else
				redirectUrl = "/";
		}
		response.sendRedirect(redirectUrl);
	}

}
