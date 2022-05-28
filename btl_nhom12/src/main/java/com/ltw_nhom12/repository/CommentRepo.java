package com.ltw_nhom12.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltw_nhom12.entity.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {
}
