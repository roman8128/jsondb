package com.jsondb.controller;

import com.jsondb.domain.User;
import com.jsondb.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    public Iterable<User> getUsers() {
        return userService.list();
    }

}
