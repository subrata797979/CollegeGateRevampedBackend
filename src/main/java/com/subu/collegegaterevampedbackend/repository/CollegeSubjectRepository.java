package com.subu.collegegaterevampedbackend.repository;

import com.subu.collegegaterevampedbackend.dto.CollegeSearchDto;
import com.subu.collegegaterevampedbackend.entity.College;
import com.subu.collegegaterevampedbackend.entity.CollegeSubject;
import com.subu.collegegaterevampedbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.subu.collegegaterevampedbackend.dto.CollegeFullDto;

import java.util.List;

@Repository
public interface CollegeSubjectRepository extends JpaRepository<CollegeSubject, Long> {

//    SELECT * FROM college LEFT OUTER JOIN college_subject ON college.college_id = college_subject.college_id
//    UNION
//    SELECT * FROM `college` RIGHT OUTER JOIN `college_subject` ON `college`.`college_id` = `college_subject`.`college_id`

    //    @Query("SELECT u FROM User u WHERE u.email = ?1 and u.password = ?2")
//    @Query("SELECT DISTINCT new com.subu.collegegaterevampedbackend.dto.CollegeFullDto(c.college_id, c.name, c.address, c.email, c.website, c.university, c.phone,s.collegeReference_id,s.subject,s.marks)"+"FROM College c, CollegeSubject s where s.marks <= ?1 and s.subject = ?2")
    @Query("SELECT DISTINCT new com.subu.collegegaterevampedbackend.dto.CollegeFullDto(c.college_id, c.name, c.address, c.email, c.website, c.university, c.phone,s.collegeReference_id,s.subject,s.marks)"+"FROM College c, CollegeSubject s where s.marks <= ?1 and s.subject = ?2")
    List<CollegeFullDto> getCollegeSubjectList(int marks, String subject);
}
