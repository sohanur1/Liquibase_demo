package com.example.liquibase_demo.service;

import com.example.liquibase_demo.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> fetchUserList();
}
