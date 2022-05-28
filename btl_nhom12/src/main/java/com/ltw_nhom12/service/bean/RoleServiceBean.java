package com.ltw_nhom12.service.bean;

import com.ltw_nhom12.entity.Role;
import com.ltw_nhom12.repository.RoleRepo;
import com.ltw_nhom12.service.RoleService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoleServiceBean implements RoleService {
    private final RoleRepo roleRepo;

    @Override
    public Role findByRoleName(String roleName) {
        return roleRepo.findByRoleName(roleName).orElse(null);
    }

    @Override
    public Role save(Role role) {
        return roleRepo.save(role);
    }
}
