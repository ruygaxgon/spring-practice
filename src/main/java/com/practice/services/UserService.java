package com.practice.services;

import com.practice.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto getUser(Integer userId);
    void createUser(UserDto userDto);
    List<UserDto> getUsers();
}
