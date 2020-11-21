package com.task.controllers;



import com.task.models.request.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.task.service.UserService;

import java.util.List;

@Validated
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor

public class UsersController {
    private final UserService userService;

    @GetMapping
    public List<UserRequest> getUsers() {
        return userService.getAllUser();
    }
}
