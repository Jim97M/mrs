package com.projects.management.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Tournament {
    private long id;
    private String name;
    private String description;
}
