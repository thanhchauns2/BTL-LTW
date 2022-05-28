package com.ltw_nhom12.service.bean;

import com.ltw_nhom12.entity.Role;
import com.ltw_nhom12.entity.RoleNameEnum;
import com.ltw_nhom12.entity.User;
import com.ltw_nhom12.entity.dto.UserDto;
import com.ltw_nhom12.repository.UserRepo;
import com.ltw_nhom12.service.RoleService;
import com.ltw_nhom12.service.UserService;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceBean implements UserService {
    private final UserRepo userRepo;
    private final RoleService roleService;
    private final PasswordEncoder passwordEncoder;

    @Override
    public User save(User user) {
        return userRepo.save(user);
    }

    @Override
    public User addNewUser(User user) {
        Role roleUser = roleService.findByRoleName(RoleNameEnum.USER.getName());

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        if (user.getRoles() == null) {
            user.setRoles(new LinkedHashSet<>());
        }
        user.getRoles().add(roleUser);

        return userRepo.save(user);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepo.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public User toUser(UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setActive(true);

        return user;
    }
}
