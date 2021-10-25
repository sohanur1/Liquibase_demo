package com.example.liquibase_demo.repository;

import com.example.liquibase_demo.entity.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivisionRepository extends JpaRepository<Division,Long> {
}
