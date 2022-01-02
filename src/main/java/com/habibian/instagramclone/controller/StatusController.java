package com.habibian.instagramclone.controller;

import com.habibian.instagramclone.entity.Status;
import com.habibian.instagramclone.service.StatusService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/statuses")
public class StatusController {

    private final StatusService statusService;

    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    @PostMapping("")
    private Status submitStatus(@RequestBody Status status) {
        return statusService.submitDataIntoDb(status);
    }

    @GetMapping("")
    private ArrayList<Status> getAllStatuses() {
        return statusService.retrieveStatuses();
    }
}
