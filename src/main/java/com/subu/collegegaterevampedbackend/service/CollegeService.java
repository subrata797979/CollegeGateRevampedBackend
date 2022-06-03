package com.subu.collegegaterevampedbackend.service;

import com.subu.collegegaterevampedbackend.dto.CollegeSearchDto;
import com.subu.collegegaterevampedbackend.entity.College;
import com.subu.collegegaterevampedbackend.entity.User;
import com.subu.collegegaterevampedbackend.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {
    @Autowired
    private CollegeRepository collegeRepository;

    public List<College> collegesByMarks(CollegeSearchDto collegeSearchDto) {
        return collegeRepository.findAll();
    }
}
