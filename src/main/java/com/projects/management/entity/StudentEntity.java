package com.projects.management.entity;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "student")
public class StudentEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    private String studentName;
    private String admNo;

}
