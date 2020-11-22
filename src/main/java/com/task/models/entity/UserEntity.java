package com.task.models.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    //@JsonProperty("roles")
    @JsonManagedReference
    @ManyToMany
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "login"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<RoleEntity> roleEntities = new ArrayList<>();

}
