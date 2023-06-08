package com.masai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AppConfig {

	
	@Bean
	  public SecurityFilterChain masaiSecurityConfig(HttpSecurity http) throws Exception {

			http.authorizeHttpRequests( (auth)->auth
					.requestMatchers("/hello1","/signIn").permitAll()
					.anyRequest().authenticated()
			).csrf(csrf -> csrf.disable())
			.formLogin(Customizer.withDefaults())
			.httpBasic(Customizer.withDefaults());
			return http.build();
	  }

	
	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
		
		UserDetails admin= User.withDefaultPasswordEncoder()
					.username("admin")
					.password("1234")
					.authorities("admin")
					.build();
		
		UserDetails user= User.withDefaultPasswordEncoder()
				.username("user")
				.password("1234")
				.authorities("read")
				.build();

		return new InMemoryUserDetailsManager(admin,user);
		
	}
	
	
	  @Bean
	    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
	        return authenticationConfiguration.getAuthenticationManager();
	    }
	
	
	
	
}