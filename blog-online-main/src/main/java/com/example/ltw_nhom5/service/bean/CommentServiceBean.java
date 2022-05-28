package com.example.ltw_nhom5.service.bean;

import com.example.ltw_nhom5.entity.Comment;
import com.example.ltw_nhom5.repository.CommentRepo;
import com.example.ltw_nhom5.service.CommentService;
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
