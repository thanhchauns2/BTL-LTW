package com.ltw_nhom12.service;

import com.ltw_nhom12.entity.Role;

public interface RoleService {
    Role findByRoleName(String roleName);

    Role save(Role role);
}
