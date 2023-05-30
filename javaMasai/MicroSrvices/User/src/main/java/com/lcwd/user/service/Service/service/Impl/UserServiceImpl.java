package com.lcwd.user.service.Service.service.Impl;

import com.lcwd.user.service.Service.entities.User;
import com.lcwd.user.service.Service.exception.NotFoundException;
import com.lcwd.user.service.Service.repository.UserRepository;
import com.lcwd.user.service.Service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User saveUser(User user) {
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        userRepository.save(user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String userId) {
        return userRepository.findById(userId).orElseThrow( () -> new NotFoundException("User not found with id: " + userId));
    }
}
