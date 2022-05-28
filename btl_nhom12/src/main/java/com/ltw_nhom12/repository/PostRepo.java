package com.ltw_nhom12.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ltw_nhom12.entity.Post;
import com.ltw_nhom12.entity.User;

import java.util.Optional;

public interface PostRepo extends JpaRepository<Post, Integer> {
    Page<Post> findByUserOrderByCreateDateDesc(User user, Pageable pageable);

    Page<Post> findAllByOrderByCreateDateDesc(Pageable pageable);

    Optional<Post> findById(Integer id);

}
