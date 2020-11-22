package com.task.service;


import com.task.models.entity.UserEntity;
import com.task.models.request.UserRequest;

import java.util.List;

public interface UserService {
    List<UserRequest> getAllUser();
    UserEntity getUserByLogin(String login);
    void deleteUser(UserEntity userEntity);
    void addUser(UserEntity userEntity);
    void editUser();
}
