package com.task.service;


import lombok.RequiredArgsConstructor;
import com.task.models.entity.UserEntity;
import com.task.models.request.UserRequest;
import org.springframework.stereotype.Service;
import com.task.repositories.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public List<UserRequest> getAllUser() {
        List<UserEntity> userEntities = userRepository.getAllUser();
        return userEntities.stream().map(userEntity -> {
            UserRequest userRequest = new UserRequest();
            userRequest.setLogin(userEntity.getLogin());
            userRequest.setName(userEntity.getName());
            userRequest.setPassword(userEntity.getPassword());
            return userRequest;
        }).collect(Collectors.toList());
    }

    public UserEntity getUserByLogin() {
        return null;
    }

    public void deleteUser(UserEntity userEntity) {

    }

    public void addUser(UserEntity userEntity) {

    }

    public void editUser() {

    }
}
