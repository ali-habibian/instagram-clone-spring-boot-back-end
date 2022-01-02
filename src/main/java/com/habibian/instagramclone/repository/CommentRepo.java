package com.habibian.instagramclone.repository;

import com.habibian.instagramclone.entity.Comment;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CommentRepo extends CrudRepository<Comment, Integer> {
    ArrayList<Comment> findAllByPostId(String postId);
}
