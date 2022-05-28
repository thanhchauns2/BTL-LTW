package com.example.ltw_nhom5.repository;

import com.example.ltw_nhom5.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Integer> {
}
