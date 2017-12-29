package com.practice.models;

import javax.persistence.*;

@Entity
public class Task {

    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer taskId;

    @Column
    private String taskName;

    @Column
    private String taskDescription;

    @ManyToOne
    private User user;

    public Task(String taskName, String taskDescription, User user) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.user = user;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
