package com.projects.management.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "manage")
public class ManagerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
