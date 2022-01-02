package com.habibian.instagramclone.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String commentId;
    private String userId;
    private String userName;
    private String postId;
    private Timestamp timestamp;
    private String comment;

    public Comment() {
    }

    public Comment(int id, String commentId, String userId, String userName, String postId, Timestamp timestamp, String comment) {
        this.id = id;
        this.commentId = commentId;
        this.userId = userId;
        this.userName = userName;
        this.postId = postId;
        this.timestamp = timestamp;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
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

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}