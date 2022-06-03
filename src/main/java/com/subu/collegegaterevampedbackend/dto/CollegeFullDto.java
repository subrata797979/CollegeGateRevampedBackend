package com.subu.collegegaterevampedbackend.dto;

public class CollegeFullDto {
    private long college_id;
    private String name;
    private String address;
    private String email;
    private String website;
    private String university;
    private String phone;
    private long collegeReference_id;
    private String subject;
    private int marks;

    public CollegeFullDto() {
        super();
    }

    public CollegeFullDto(long college_id, String name, String address, String email, String website, String university, String phone, long collegeReference_id, String subject, int marks) {
        this.college_id = college_id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.website = website;
        this.university = university;
        this.phone = phone;
        this.collegeReference_id = collegeReference_id;
        this.subject = subject;
        this.marks = marks;
    }

    public CollegeFullDto(String name, String address, String email, String website, String university, String phone, long collegeReference_id, String subject, int marks) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.website = website;
        this.university = university;
        this.phone = phone;
        this.collegeReference_id = collegeReference_id;
        this.subject = subject;
        this.marks = marks;
    }

    public long getCollege_id() {
        return college_id;
    }

    public void setCollege_id(long college_id) {
        this.college_id = college_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getCollegeReference_id() {
        return collegeReference_id;
    }

    public void setCollegeReference_id(long collegeReference_id) {
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
        return "CollegeFullDto{" +
                "college_id=" + college_id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", website='" + website + '\'' +
                ", university='" + university + '\'' +
                ", phone='" + phone + '\'' +
                ", collegeReference_id=" + collegeReference_id +
                ", subject='" + subject + '\'' +
                ", marks=" + marks +
                '}';
    }
}
