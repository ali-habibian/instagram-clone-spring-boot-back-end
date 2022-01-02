package com.habibian.instagramclone.controller;

import com.habibian.instagramclone.entity.User;
import com.habibian.instagramclone.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("")
    private User submitUser(@RequestBody User user) {
        return userService.submitMetaDataOfUser(user);
    }

    @GetMapping("/{userId}")
    private User getUserDetails(@PathVariable String userId) {
        return userService.displayUserMetaData(userId);
    }
}
