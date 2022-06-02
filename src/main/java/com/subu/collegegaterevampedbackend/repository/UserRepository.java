package com.subu.collegegaterevampedbackend.repository;

import com.subu.collegegaterevampedbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
