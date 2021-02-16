package com.example.osman;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class app_sec_config extends WebSecurityConfigurerAdapter
{
	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		// TODO Auto-generated method stub
		//return super.userDetailsService();
		
		
		List<UserDetails> users = new ArrayList<>();
		users.add(User.withDefaultPasswordEncoder().username("osman").password("12345").roles("user").build());
		
		return new InMemoryUserDetailsManager(users);
		
		
	}

}
