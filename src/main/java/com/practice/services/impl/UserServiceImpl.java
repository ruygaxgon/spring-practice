package com.practice.services.impl;

import com.practice.dto.UserDto;
import com.practice.models.User;
import com.practice.repository.Repositories;
import com.practice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {
    @Autowired
    Repositories.UserRepository userRepository;

    @Override
    public UserDto getUser(Integer userId) {
        userRepository.getOne(userId);
        return null;
    }

    @Override
    public void createUser(UserDto userDto) {
        User user = null;
        userRepository.save(user);
    }

    @Override
    public List<UserDto> getUsers() {
        return userRepository.findAll().stream().map(this::entityToDto).collect(Collectors.toList());
    }

    private UserDto entityToDto(User user) {
        return new UserDto(user.getUserId(), user.getUserName(), user.getTasks());
    }

    private User dtoToEntity(UserDto userDto) {
        return new User(userDto.getUserName(), userDto.getTasks());
    }

}
