package com.example.liquibase_demo.service;

import com.example.liquibase_demo.entity.Division;

import java.util.List;

public interface DivisionService {
    Division saveDivision(Division division);

    List<Division> fetchDivisionList();
}
