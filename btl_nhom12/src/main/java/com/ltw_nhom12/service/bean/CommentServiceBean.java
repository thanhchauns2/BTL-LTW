package com.ltw_nhom12.service.bean;

import com.ltw_nhom12.entity.Comment;
import com.ltw_nhom12.repository.CommentRepo;
import com.ltw_nhom12.service.CommentService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class CommentServiceBean implements CommentService {

    private final CommentRepo commentRepo;

    @Override
    public Comment save(Comment comment) {
        return commentRepo.saveAndFlush(comment);
    }
}
