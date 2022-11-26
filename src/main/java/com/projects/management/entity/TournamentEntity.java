package com.projects.management.entity;
import lombok.Data;
import javax.persistence.*;
@Data
@Entity
@Table(name = "tournament")
public class TournamentEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String description;
}

