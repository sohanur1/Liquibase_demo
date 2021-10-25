package com.example.liquibase_demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "division")
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long divisionId;
    @Column(unique = true)
    String divisionName;
    @Column(unique = true)
    String divisionCode;


}
