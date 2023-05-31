package com.lcwd.user.service.Service.service.Impl;

import com.lcwd.user.service.Service.entities.Rating;
import com.lcwd.user.service.Service.entities.User;
import com.lcwd.user.service.Service.exception.NotFoundException;
import com.lcwd.user.service.Service.repository.UserRepository;
import com.lcwd.user.service.Service.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;


    private Logger logger =  LoggerFactory.getLogger(UserServiceImpl.class);


    @Override
    public User saveUser(User user) {
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        userRepository.save(user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        ArrayList<Rating> forObj =  restTemplate.getForObject("http://localhost:8083/ratings/all", ArrayList.class);

        logger.info(" {} ", forObj);
//        List<User> users = userRepository.findAll();
//        for(User u: users){
//            u.setRatings(forObj);
//        }
        List<User> users = userRepository.findAll();
//        for(Rating r: forObj) {
//            for (User u : users) {
//                if (r.getUserId() == u.getUserId()) {
//                    u.setRatings(forObj);
//                }
//            }
//        }
        return users;
    }

    @Override
    public User getUserById(String userId) {

//        http://localhost:8083/ratings/user/0619709d-c854-425c-a8de-2db02b2a7c1a
       User u = userRepository.findById(userId).orElseThrow( () -> new NotFoundException("User not found with id: " + userId));

       ArrayList<Rating> forObj =  restTemplate.getForObject("http://localhost:8083/ratings/user/"+u.getUserId(), ArrayList.class);

        logger.info(" {} ", forObj);
        System.out.println(forObj);

        u.setRatings(forObj);
        return u;


    }
}
