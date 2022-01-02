package com.habibian.instagramclone.service;

import com.habibian.instagramclone.entity.User;
import com.habibian.instagramclone.repository.UserRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Transactional
    public User submitMetaDataOfUser(User user) {
        return userRepo.save(user);
    }

    public User displayUserMetaData(String userId) {
        return userRepo.findByUserId(userId);
    }
}
