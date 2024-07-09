package com.springMVCRegistration.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

@Configuration
@EnableWebSecurity(debug = true)
public class MySecurityConfig {

	@Autowired
	HttpSecurity httpSecurity;

	@Bean
	public InMemoryUserDetailsManager setUpUsers() {
		UserDetails user1 = User.withUsername("Mahesh").password("1234").roles("admin", "user").build();
		return new InMemoryUserDetailsManager(user1);
	}

	@Bean
	PasswordEncoder passwordEncoder() {

		return NoOpPasswordEncoder.getInstance();
	}
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//
//		return new BCryptPasswordEncoder();
//	}

	@Bean
	SecurityFilterChain settingUpHttpSecurity() throws Exception {

	      httpSecurity.authorizeHttpRequests(customizer -> {
	            customizer.requestMatchers("/helloWorld", "/hello").authenticated()
	                      .requestMatchers("/world").permitAll()
	                      .anyRequest().authenticated();
	        });
		httpSecurity.formLogin(Customizer.withDefaults());
//		httpSecurity.httpBasic(Customizer.withDefaults());
//		httpSecurity.csrf().disable();
		return httpSecurity.build();
	}

	@Bean(name = "mvcHandlerMappingIntrospector")
	public HandlerMappingIntrospector mvcHandlerMappingIntrospector() {
		return new HandlerMappingIntrospector();
	}

	
	
}
