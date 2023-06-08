package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
public class MyController {

	
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	
	@GetMapping("/hello1")
	public String sayHello1() {
		return "Welcome1";
	}
	
	@GetMapping("/hello2")
	public String sayHello2() {
		return "Welcome2";
	}
	
	@PostMapping("/signIn")
	public String loginHandler(@RequestBody LoginBean loginBean, HttpServletRequest req) {
	
		try {
		Authentication auth= authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginBean.getUsername(), loginBean.getPassword()));
		
			SecurityContext sc= SecurityContextHolder.getContext();
			sc.setAuthentication(auth);
			
			HttpSession session= req.getSession(true);
			session.setAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY, sc);
			
			
			return "Authentication Sucessfull";
			
		}
		
		catch(Exception e) {
			return "Authentication Fails";
		}
			
		
		
	}
	
	
	
}
