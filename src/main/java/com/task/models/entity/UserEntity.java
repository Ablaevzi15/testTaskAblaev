package com.task.models.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
@Data
@Entity
@Table(name = "user_1")
public class UserEntity {
    @Id
    @Column(name = "login")
    @EqualsAndHashCode.Include
    @ToString.Include
    private String login;

    @Column(name = "name")
    @EqualsAndHashCode.Include
    @ToString.Include
    private String name = "";

    @Column(name = "password")
    @EqualsAndHashCode.Include
    @ToString.Include
    private String password;





}
