package com.example.ltw_nhom5.controller;

import com.example.ltw_nhom5.entity.User;
import com.example.ltw_nhom5.entity.dto.UserDto;
import com.example.ltw_nhom5.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class AccountController {
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;
    @GetMapping("/login")
    public String showLoginPage(Model model) {
        return "login";
    }

    @GetMapping("/user")
    public String showUserDetail(Model model, Authentication authentication) {
        model.addAttribute("userDto", new UserDto());
        model.addAttribute("userDetail", userService.findByUsername(authentication.getName()));
        return "user";
    }

    @PostMapping("/user")
    public String updateUserDetail(@ModelAttribute("userDto") UserDto userDto) {
//        User user = userService.findByUsername(userDto.getUsername());
//        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
//        userService.save(user);
        return "redirect:/";
    }

    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "register";
    }

    @PostMapping("/register")
    public String addUser(@ModelAttribute("userDto") UserDto userDto) {
        User user = userService.toUser(userDto);
        userService.addNewUser(user);
        return "redirect:/login";
    }
}
