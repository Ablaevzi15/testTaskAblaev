package com.task.service;

import com.task.models.entity.RoleEntity;
import com.task.repositories.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Override
    public RoleEntity getRole(String name) {
        return roleRepository.getRoleByName(name);
    }
}
