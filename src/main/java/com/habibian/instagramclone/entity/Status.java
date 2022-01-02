package com.habibian.instagramclone.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Status {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String statusId;
    private String userId;
    private String userName;
    private String path;
    private String timeStamp;

    public Status() {
    }

    public Status(int id, String statusId, String userId, String userName, String path, String timeStamp) {
        this.id = id;
        this.statusId = statusId;
        this.userId = userId;
        this.userName = userName;
        this.path = path;
        this.timeStamp = timeStamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
