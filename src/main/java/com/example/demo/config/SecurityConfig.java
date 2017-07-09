/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 *
 * @author Leanghour
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    private AuthenticationSuccessHandler successHandler;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private AuthenticationEntryPoint authenticationEntryPoint;
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.logout()
			.logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
        
        http.formLogin()
			.loginPage("/login")
			.usernameParameter("username")
			.passwordParameter("password")
			.successHandler(successHandler);
        http.exceptionHandling()
			.authenticationEntryPoint(authenticationEntryPoint);
        http.authorizeRequests().antMatchers("/articles/saves**","/articles/add**","/articles/remove**",
                "/articles/updates**")
                .hasAnyRole("ADMIN").
        antMatchers("/articles/user/**","/articles/filter/**").hasAnyRole("USER","ADMIN");
    
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//    
//        auth.inMemoryAuthentication().withUser("admin").password("admin").roles("ADMIN").and()
//                .withUser("user").password("user").roles("USER");
//    }
    
    
     
}
