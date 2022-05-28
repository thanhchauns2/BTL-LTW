package com.example.ltw_nhom5.service.bean;

import com.example.ltw_nhom5.entity.Role;
import com.example.ltw_nhom5.repository.RoleRepo;
import com.example.ltw_nhom5.service.RoleService;
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
