package com.habibian.instagramclone.controller;

import com.habibian.instagramclone.entity.Post;
import com.habibian.instagramclone.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("")
    private Post submitUserPost(@RequestBody Post post) {
        return postService.submitPostToDb(post);
    }

    @GetMapping("")
    private ArrayList<Post> getAllPosts() {
        return postService.retrievePosts();
    }
}
