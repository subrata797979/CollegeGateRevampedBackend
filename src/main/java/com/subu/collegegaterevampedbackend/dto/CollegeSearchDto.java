package com.subu.collegegaterevampedbackend.dto;

public class CollegeSearchDto {
    private int marks;
    private String subject;

    public CollegeSearchDto(int marks, String subject) {
        this.marks = marks;
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "CollegeSearchDto{" +
                "marks=" + marks +
                ", subject='" + subject + '\'' +
                '}';
    }
}
