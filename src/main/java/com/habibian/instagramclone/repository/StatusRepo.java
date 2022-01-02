package com.habibian.instagramclone.repository;

import com.habibian.instagramclone.entity.Status;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface StatusRepo extends CrudRepository<Status, Integer> {
    ArrayList<Status> findAll();
}
