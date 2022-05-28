package com.ltw_nhom12.service;

import java.util.List;
import java.util.Optional;

import com.ltw_nhom12.entity.Post;

public interface PostService {
    Optional<Post> findById(Integer id);
    List<Post> findAll();
    Post save(Post post);

    void delete(Post post);

//    Page<Post> findByUserOrderedByDatePageable(User user, int page);
//    Page<Post> findAllOrderedByDatePageable(int page);
}
