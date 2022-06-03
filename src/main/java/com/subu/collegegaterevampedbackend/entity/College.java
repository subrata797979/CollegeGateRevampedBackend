package com.subu.collegegaterevampedbackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long college_id;
    private String name;
    private String address;
    private String email;
    private String website;
    private String university;
    private String phone;

    public College() {
        super();
    }

    public College(long college_id, String name, String address, String email, String website, String university, String phone) {
        this.college_id = college_id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.website = website;
        this.university = university;
        this.phone = phone;
    }

    public College(String name, String address, String email, String website, String university, String phone) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.website = website;
        this.university = university;
        this.phone = phone;
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

    @Override
    public String toString() {
        return "College{" +
                "college_id=" + college_id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", website='" + website + '\'' +
                ", university='" + university + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
