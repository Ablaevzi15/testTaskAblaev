package com.task.controllers;


import com.task.models.entity.RoleEntity;
import com.task.models.entity.UserEntity;
import com.task.models.request.UserRequest;
import com.task.service.RoleService;
import com.task.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor

public class UsersController {
    private final UserService userService;
    private final RoleService roleService;

    @GetMapping
    public List<UserRequest> getUsers() {
        return userService.getAllUser();
    }

    @GetMapping("/find_user")
    public UserEntity getUserByLogin(@RequestBody String login) {
        return userService.getUserByLogin(login);
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestBody String login) {
        userService.deleteUser(login);
    }

    @GetMapping("/role")
    public RoleEntity getRole(@RequestBody String name) {
        return roleService.getRole(name);
    }

}
