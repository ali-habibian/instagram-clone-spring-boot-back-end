package com.habibian.instagramclone.service;

import com.habibian.instagramclone.entity.Post;
import com.habibian.instagramclone.entity.Status;
import com.habibian.instagramclone.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class PostService {

    private final PostRepo postRepo;
    private final UserService userService;

    public PostService(PostRepo postRepo, UserService userService) {
        this.postRepo = postRepo;
        this.userService = userService;
    }

    @Transactional
    public Post submitPostToDb(Post post) {
        return postRepo.save(post);
    }

    public ArrayList<Post> retrievePosts() {
        ArrayList<Post> posts = postRepo.findAll();
        for (Post post : posts) {
            post.setUserName(userService.displayUserMetaData(post.getUserId()).getUserName());
        }
        return posts;
    }
}
