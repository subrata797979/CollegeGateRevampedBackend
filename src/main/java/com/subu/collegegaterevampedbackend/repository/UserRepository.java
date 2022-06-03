package com.subu.collegegaterevampedbackend.repository;

import com.subu.collegegaterevampedbackend.dto.UserLoginDto;
import com.subu.collegegaterevampedbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.email = ?1 and u.password = ?2")
    public User findByEmailPassword(String email, String password);
}
