package com.subu.collegegaterevampedbackend.controller;
import com.subu.collegegaterevampedbackend.dto.CollegeFullDto;
import com.subu.collegegaterevampedbackend.dto.CollegeSearchDto;
import com.subu.collegegaterevampedbackend.dto.UserLoginDto;
import com.subu.collegegaterevampedbackend.entity.User;
import com.subu.collegegaterevampedbackend.service.CollegeService;
import com.subu.collegegaterevampedbackend.service.CollegeSubjectService;
import com.subu.collegegaterevampedbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    // PUT Mapping
    @PutMapping("/{id}")
    public String updateStudent(@RequestBody User u, @PathVariable long id) {
        User newUser = this.userService.getOneUserById(id);
        Optional<User> studentOptional = Optional.ofNullable(newUser);

        if (!studentOptional.isPresent())
            return "User not found!";
        else {
            newUser.setUsername(u.getUsername());
            newUser.setEmail(u.getEmail());
            newUser.setCollege_id(u.getCollege_id());
            userService.storeUser(newUser);
            return "User's College Modified Successfully!";
        }
    }

    // DELETE Mapping
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable final Long id ) {
        userService.delete(id);
        return "redirect:/students";
    }


    @PostMapping(path="/checkByEmail", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> checkUserByEmail(@RequestBody UserLoginDto userLogin) {
        List<User> userList = new ArrayList<>();
        System.out.println(userLogin);
        User user = userService.checkEmail(userLogin);
        System.out.println(user);
        if(user == null) {
            return new ResponseEntity<>(userList, HttpStatus.NOT_FOUND);
        }
        else {
            userList.add(user);
            return new ResponseEntity<>(userList, HttpStatus.OK);
        }
    }

}

@CrossOrigin
@RequestMapping("api/colleges")
@RestController
class CollegeController {
    @Autowired
    private CollegeService collegeService;
}

@CrossOrigin
@RequestMapping("api/cs")
@RestController
class CollegeSubjectController {

    @Autowired
    private CollegeSubjectService collegeSubjectService;

    @PostMapping("/searchByMarks")
    public ResponseEntity<List<CollegeFullDto>> searchCollegeByMarks(@RequestBody CollegeSearchDto collegeSearchDto) {
        List<CollegeFullDto> collegeList;
        collegeList = collegeSubjectService.searchCollegeBySubject(collegeSearchDto);
        if(collegeList == null) {
            return new ResponseEntity<>(collegeList, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(collegeList, HttpStatus.OK);
        }
    }
}



