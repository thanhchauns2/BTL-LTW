package com.ltw_nhom12.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltw_nhom12.entity.User;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
