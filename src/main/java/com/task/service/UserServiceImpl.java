package com.task.service;


import com.task.models.entity.RoleEntity;
import com.task.models.entity.UserEntity;
import com.task.models.request.UserRequest;
import com.task.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    @Override
    public UserEntity getUserByLogin(String login) {
        UserEntity userEntity = userRepository.getUserByLogin(login);
        List<RoleEntity> roles = userEntity.getRoleEntities().stream()
                .peek(roleEntity -> userEntity.setRoleEntities(new ArrayList<>()))
                .collect(Collectors.toList());
        userEntity.setRoleEntities(roles);
        return userEntity;
    }

    @Override
    public void deleteUser(String login) {
        userRepository.deleteById(login);
    }

    @Override
    public void addUser(UserEntity userEntity) {

    }

    @Override
    public void editUser() {

    }


}
