package com.habibian.instagramclone.service;

import com.habibian.instagramclone.entity.Status;
import com.habibian.instagramclone.repository.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class StatusService {

    private final StatusRepo statusRepo;
    private final UserService userService;

    public StatusService(StatusRepo statusRepo, UserService userService) {
        this.statusRepo = statusRepo;
        this.userService = userService;
    }

    @Transactional
    public Status submitDataIntoDb(Status status) {
        return statusRepo.save(status);
    }

    public ArrayList<Status> retrieveStatuses() {
        ArrayList<Status> statuses = statusRepo.findAll();
        for (Status status : statuses) {
            status.setUserName(userService.displayUserMetaData(status.getUserId()).getUserName());
        }
        return statuses;
    }
}
