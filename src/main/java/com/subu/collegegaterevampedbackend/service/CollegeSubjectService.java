package com.subu.collegegaterevampedbackend.service;

import com.subu.collegegaterevampedbackend.dto.CollegeFullDto;
import com.subu.collegegaterevampedbackend.dto.CollegeSearchDto;
import com.subu.collegegaterevampedbackend.dto.UserLoginDto;
import com.subu.collegegaterevampedbackend.entity.College;
import com.subu.collegegaterevampedbackend.entity.User;
import com.subu.collegegaterevampedbackend.repository.CollegeRepository;
import com.subu.collegegaterevampedbackend.repository.CollegeSubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeSubjectService {
    @Autowired
    private CollegeSubjectRepository collegeSubjectRepository;

    public List<CollegeFullDto> searchCollegeBySubject(CollegeSearchDto collegeSearchDto) {
        return collegeSubjectRepository.getCollegeSubjectList(collegeSearchDto.getMarks(), collegeSearchDto.getSubject());
    }
}
