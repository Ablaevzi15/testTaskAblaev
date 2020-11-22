package com.task.repositories;

import com.task.models.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    @Query(value = "SELECT r FROM RoleEntity r where r.roleName = :name")
    RoleEntity getRoleByName(String name);
}
