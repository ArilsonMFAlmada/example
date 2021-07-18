package com.validationexample.example.service;

import com.validationexample.example.repository.UserRepository;
import com.validationexample.example.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void addUser (User user){
        userRepository. save(user);
    }
}
