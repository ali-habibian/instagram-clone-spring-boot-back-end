package com.habibian.instagramclone.service;

import com.habibian.instagramclone.entity.Comment;
import com.habibian.instagramclone.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class CommentService {
    private final CommentRepo commentRepo;
    private final UserService userService;

    public CommentService(CommentRepo commentRepo, UserService userService) {
        this.commentRepo = commentRepo;
        this.userService = userService;
    }

    @Transactional
    public Comment submitDataToDb(Comment comment) {
        return commentRepo.save(comment);
    }

    public ArrayList<Comment> retrieveComments(String postId) {
        ArrayList<Comment> comments = commentRepo.findAllByPostId(postId);
        for (Comment comment : comments) {
            comment.setUserName(userService.displayUserMetaData(comment.getUserId()).getUserName());
        }
        return comments;
    }
}
