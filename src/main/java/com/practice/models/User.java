package com.practice.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User implements Serializable {
    private static final long serialVersionUID = -655714642544559472L;

    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer userId;

    @Column
    private String userName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Task> tasks = new ArrayList<>();

    public User(String userName, List<Task> tasks) {
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
