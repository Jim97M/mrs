package com.projects.management.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "club")
public class ClubEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    private String name;
    private String category;
    private String type;
}
