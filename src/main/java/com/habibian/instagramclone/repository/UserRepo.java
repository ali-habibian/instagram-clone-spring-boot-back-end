package com.habibian.instagramclone.repository;

import com.habibian.instagramclone.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
    User findByUserId(String userId);
}
