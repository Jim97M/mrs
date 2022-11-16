package com.projects.management.services;
import com.projects.management.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    Student createStudent(Student student);

    List<Student> getAllStudents();
}
