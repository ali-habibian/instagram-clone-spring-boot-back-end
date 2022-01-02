package com.habibian.instagramclone.repository;

import com.habibian.instagramclone.entity.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface PostRepo extends CrudRepository<Post, Integer> {
    ArrayList<Post> findAll();
}
