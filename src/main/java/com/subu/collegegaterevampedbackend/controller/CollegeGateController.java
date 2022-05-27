package com.subu.collegegaterevampedbackend.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("api")
@RestController
public class CollegeGateController {
    @RequestMapping
    public String getCollegeGateControllers() {
        return "College Gate Controllers : \n1. student \n2. none \n3. none";
    }
    @GetMapping("/students")
    public String getStudents() {
        return "List of all students : \n1. Subrata \n2. Alok \n3. Rinika";
    }
}

@RequestMapping("api/student")
@RestController
class StudentController {
    @GetMapping("/{id}")
    public String getStudentById(@PathVariable("id") int id) {
        return "Student ID : "+id;
    }
}
