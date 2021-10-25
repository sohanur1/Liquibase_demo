package com.example.liquibase_demo.service;

import com.example.liquibase_demo.entity.Role;
import com.example.liquibase_demo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;
    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> fetchRoleList() {
        return roleRepository.findAll();
    }
}
