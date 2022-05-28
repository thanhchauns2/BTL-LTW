package com.ltw_nhom12.controller;

import com.ltw_nhom12.entity.Post;
import com.ltw_nhom12.service.PostService;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class HomeController {
    @Autowired
    private final PostService postService;



    @GetMapping("/")
    public String home(Model model) {
        List<Post> posts = postService.findAll();
        model.addAttribute("posts", posts);
        return "home";
    }
}
