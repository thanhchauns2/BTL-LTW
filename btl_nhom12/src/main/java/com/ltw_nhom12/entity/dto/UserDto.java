package com.ltw_nhom12.entity.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String dob;
    private String gender;
    private String email;
    private String description;
    private Boolean active;
}
