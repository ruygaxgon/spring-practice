package com.practice.controller;

import com.practice.dto.UserDto;
import com.practice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/users")
    public List<UserDto> getUsers() {
        return userService.getUsers();
    }

    @RequestMapping("/user/{id}")
    public UserDto getUser(@PathVariable Integer id) {
        return userService.getUser(id);
    }

    @RequestMapping(path = "/user", method = RequestMethod.POST)
    public void createUser(@RequestBody UserDto userDto) {
        userService.createUser(userDto);
    }
}
