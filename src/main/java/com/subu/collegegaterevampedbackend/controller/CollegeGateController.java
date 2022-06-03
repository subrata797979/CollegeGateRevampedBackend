package com.subu.collegegaterevampedbackend.controller;
import com.subu.collegegaterevampedbackend.dto.UserLoginDto;
import com.subu.collegegaterevampedbackend.entity.User;
import com.subu.collegegaterevampedbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RequestMapping("api")
@RestController
public class CollegeGateController {
    @RequestMapping
    public String getCollegeGateControllers() {
        return "College Gate Controllers : \n1. users \n2. none \n3. none";
    }
}

@CrossOrigin
@RequestMapping("api/users")
@RestController
class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUsers() {
        return this.userService.getUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable final long id) {
        return this.userService.getOneUserById(id);
    }

    @PostMapping
    public void saveUser(@RequestBody User user) {
        userService.storeUser(user);
    }

    @PostMapping(path="/checkByEmail", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> checkUserByEmail(@RequestBody UserLoginDto userLogin) {
        List<User> userList = new ArrayList<>();
        System.out.println(userLogin);
        User user = userService.checkEmail(userLogin);
        System.out.println(user);
        if(user == null) {
            return new ResponseEntity<Object>(userList, HttpStatus.NOT_FOUND);
        }
        else {
            userList.add(user);
            return new ResponseEntity<Object>(userList, HttpStatus.OK);
        }
    }
}
