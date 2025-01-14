package com.mindhub.AppSprint2.dtos;

import com.mindhub.AppSprint2.models.RolEnum;
import com.mindhub.AppSprint2.models.UserEntity;

public class UserDto {

    private Long id;

    private String username;

    private String password;

    private String email;

    private RolEnum rol;

    public UserDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RolEnum getRol() {
        return rol;
    }

    public void setRol(RolEnum rol) {
        this.rol = rol;
    }
}
