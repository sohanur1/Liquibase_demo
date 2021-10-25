package com.example.liquibase_demo.controller;

import com.example.liquibase_demo.entity.Role;
import com.example.liquibase_demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    private RoleService roleService;
    @PostMapping("/role")
    public Role saveRole(@RequestBody Role role){
        return roleService.saveRole(role);
    }

    @GetMapping("/role")
    public List<Role> fetchRoleList(){
        return roleService.fetchRoleList();
    }
}
