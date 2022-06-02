package com.subu.collegegaterevampedbackend.controller;
import com.subu.collegegaterevampedbackend.entity.User;
import com.subu.collegegaterevampedbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
