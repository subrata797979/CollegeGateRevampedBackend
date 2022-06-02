package com.subu.collegegaterevampedbackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    private String username;
    private String email;
    private String password;
    private Long college_id;

    public User() {
        super();
    }
    public User(Long user_id, String username, String email, String password, Long college_id) {
        this.user_id = user_id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.college_id = college_id;
    }

    // getters
    public Long getUser_id() {
        return user_id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Long getCollege_id() {
        return college_id;
    }

    // setters
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCollege_id(Long college_id) {
        this.college_id = college_id;
    }
}
