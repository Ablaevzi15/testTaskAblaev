package com.task.repositories;


import com.task.models.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, String> {
    @Query(value = "SELECT u FROM UserEntity u")
    List<UserEntity> getAllUser();

    @Query(value = "select u FROM UserEntity u WHERE u.login = :login")
    UserEntity getUserByLogin(String login);
}
