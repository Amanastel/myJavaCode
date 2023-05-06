package com.learn.service;

import com.learn.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> list = new ArrayList<>();

    public UserService(List<User> list) {
        this.list = list;
    }

    public UserService() {
        list.add(new User("abc","abc","abc@mail.com"));
        list.add(new User("abcz","abcz","abcz@mail.com"));
    }

    public List<User> getAllUser(){
        return this.list;
    }

    public User getSingalUser(String username){

        return this.list.stream().filter((user) -> user.getUsername().equals(username)).findAny().orElse(null);
    }

    public User addUser(User user){
         this.list.add(user);
        return user;
    }
}
