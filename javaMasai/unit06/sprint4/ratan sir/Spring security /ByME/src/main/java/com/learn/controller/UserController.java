package com.learn.controller;

import com.learn.model.User;
import com.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
    private UserService userService;


    @GetMapping("/")
    public List<User> getAllUser(){
        return this.userService.getAllUser();
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
        return this.userService.getSingalUser(username);
    }

    @PostMapping("/")
    public User add(@RequestBody User user){
        return this.userService.addUser(user);
    }
}
