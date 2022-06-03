package com.subu.collegegaterevampedbackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CollegeSubject {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long collegeReference_id;
    private String subject;
    private int marks;

    public CollegeSubject(String subject, int marks) {
        this.subject = subject;
        this.marks = marks;
    }

    public CollegeSubject() {
        super();
    }

    public long getCollege_id() {
        return collegeReference_id;
    }

    public void setCollege_id(long collegeReference_id) {
        this.collegeReference_id = collegeReference_id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "CollegeSubject{" +
                "college_id=" + collegeReference_id +
                ", subject='" + subject + '\'' +
                ", marks=" + marks +
                '}';
    }
}
