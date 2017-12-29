package com.practice.repository;

import com.practice.models.Task;
import com.practice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface Repositories {

    @Repository
    interface UserRepository extends JpaRepository<User, Integer> {
    }

    @Repository
    interface TaskRepository extends JpaRepository<Task, Integer> {
    }
}
