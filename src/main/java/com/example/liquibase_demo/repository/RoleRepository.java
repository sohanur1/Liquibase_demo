package com.example.liquibase_demo.repository;

import com.example.liquibase_demo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

}
