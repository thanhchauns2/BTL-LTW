package com.ltw_nhom12.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltw_nhom12.entity.Role;

import java.util.Optional;

public interface RoleRepo extends JpaRepository<Role, Integer> {
    Optional<Role> findByRoleName(String roleName);
}
