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
@Table(name = "user")
public class User {
    @Id
     @GeneratedValue(strategy= GenerationType.AUTO)
    long id;
    String userName;
    String userPassword;
    String userMail;
    String userBirthdate;
}
