package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.masai.model.Customer;
import com.masai.repository.CustomerRepository;

@Component
public class MyAuthenticationProvider implements AuthenticationProvider{

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private PasswordEncoder pEncoder;
	
	
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		
		System.out.println("Out Authentication Provider is used...");
		
		String username = authentication.getName();
		String pwd = authentication.getCredentials().toString();

		Optional<Customer> opt = customerRepository.findByEmail(username);

		if (opt.isEmpty())
			throw new BadCredentialsException("No User registered with this details");
		else {

				Customer customer= opt.get();
			
			if (pEncoder.matches(pwd, customer.getPassword())) {

		List<GrantedAuthority> authorities = new ArrayList<>();
		//authorities.add(new SimpleGrantedAuthority(customer.getRole()));

		return new UsernamePasswordAuthenticationToken(username, pwd, authorities);

			} else
				throw new BadCredentialsException("Invalid Password");

		
		}
		
		
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
		
		
		
	}

}
