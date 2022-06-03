package com.subu.collegegaterevampedbackend.service;

import com.subu.collegegaterevampedbackend.dto.UserLoginDto;
import com.subu.collegegaterevampedbackend.entity.User;
import com.subu.collegegaterevampedbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // get
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getOneUserById(long user_id) {
        return userRepository.findById(user_id).get();
    }

    // post
    public void storeUser(User user) {
        userRepository.save(user);
    }

    public User checkEmail(UserLoginDto userLogin) {
        return userRepository.findByEmailPassword(userLogin.getEmail(), userLogin.getPassword());
    }
}
