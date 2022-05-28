package com.example.ltw_nhom5.service;

import com.example.ltw_nhom5.entity.Role;

public interface RoleService {
    Role findByRoleName(String roleName);

    Role save(Role role);
}
