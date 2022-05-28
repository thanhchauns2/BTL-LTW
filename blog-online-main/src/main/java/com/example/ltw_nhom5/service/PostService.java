package com.example.ltw_nhom5.service;

import com.example.ltw_nhom5.entity.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    Optional<Post> findById(Integer id);
    List<Post> findAll();
    Post save(Post post);

    void delete(Post post);

//    Page<Post> findByUserOrderedByDatePageable(User user, int page);
//    Page<Post> findAllOrderedByDatePageable(int page);
}
