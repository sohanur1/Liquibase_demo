package com.example.liquibase_demo.service;

import com.example.liquibase_demo.entity.Role;

import java.util.List;

public interface RoleService {
    Role saveRole(Role role);

    List<Role> fetchRoleList();
}
