package com.projects.management.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Student {
  private long id;
  private String studentName;
  private String admNo;
}
