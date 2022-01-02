package com.habibian.instagramclone.controller;

import com.habibian.instagramclone.entity.Comment;
import com.habibian.instagramclone.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/comments")
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("")
    private Comment submitUserComment(@RequestBody Comment comment) {
        return commentService.submitDataToDb(comment);
    }

    @GetMapping("/{postId}")
    private ArrayList<Comment> getCommentsForPost(@PathVariable String postId) {
        return commentService.retrieveComments(postId);
    }
}
