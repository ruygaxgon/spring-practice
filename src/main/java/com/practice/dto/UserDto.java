package com.practice.dto;

import com.practice.models.Task;

import java.util.ArrayList;
import java.util.List;

public class UserDto {

    Integer userId;
    String userName;
    List<Task> tasks = new ArrayList<>();

    public UserDto(Integer userId, String userName, List<Task> tasks) {
        this.userId = userId;
        this.userName = userName;
        this.tasks = tasks;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
