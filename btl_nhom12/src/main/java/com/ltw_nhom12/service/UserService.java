package com.ltw_nhom12.service;

import com.ltw_nhom12.entity.User;
import com.ltw_nhom12.entity.dto.UserDto;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User save(User user);

    User addNewUser(User user);

    Optional<User> findByUsername(String username);

    List<User> getUsers();

    User findById(Integer id);

    User toUser(UserDto userDto);
}
