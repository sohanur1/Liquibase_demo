package com.example.liquibase_demo.service;

import com.example.liquibase_demo.entity.Division;
import com.example.liquibase_demo.repository.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService{

    @Autowired
    private DivisionRepository divisionRepository;
    @Override
    public Division saveDivision(Division division) {
        return divisionRepository.save(division);
    }

    @Override
    public List<Division> fetchDivisionList() {
        return divisionRepository.findAll();
    }
}
