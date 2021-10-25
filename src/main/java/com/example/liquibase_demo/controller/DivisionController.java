package com.example.liquibase_demo.controller;

import com.example.liquibase_demo.entity.Division;
import com.example.liquibase_demo.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DivisionController {
    @Autowired
    private DivisionService divisionService;
    @PostMapping("/division")
    public Division saveDivision(@RequestBody Division division){
        return divisionService.saveDivision(division);
    }
    @GetMapping("/division")
    public List<Division> fetchDivisionList(){
        return divisionService.fetchDivisionList();
    }
}
