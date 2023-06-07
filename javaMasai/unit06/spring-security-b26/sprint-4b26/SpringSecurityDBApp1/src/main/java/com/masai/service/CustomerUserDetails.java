package com.masai.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.masai.model.Customer;

public class CustomerUserDetails implements UserDetails{
	
	
	private Customer customer;
	

	public CustomerUserDetails(Customer customer) {
		this.customer = customer;
	}
	
	
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		//List<Authority> auths= customer.getAuthorities();

		//for(Authority auth:auths) {
			//SimpleGrantedAuthority simpleGrantedAuthority=new SimpleGrantedAuthority(auth.getName());
			//authorities.add(simpleGrantedAuthority);
		//}
		
		return authorities;
	}

	@Override
	public String getPassword() {
		
		return customer.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return customer.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
