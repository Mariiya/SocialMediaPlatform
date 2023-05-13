package com.platform.reverie.controllers;

import com.platform.reverie.models.User;
import com.platform.reverie.services.UserDaoService;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.Collection;


@RestController
public class UsersController {

    private UserDaoService userDaoService;

    public UsersController(UserDaoService userDaoService) {
        this.userDaoService = userDaoService;
    }

    @GetMapping(path = "/users")
    public Collection<User> getAllUsers() {
        return userDaoService.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public User getUser(@PathVariable BigInteger id) {
        return userDaoService.getUser(id);
    }

    @PostMapping(path="/users")
    public User createUser(@RequestBody User user) {
        return userDaoService.createUser(user);
    }

}
