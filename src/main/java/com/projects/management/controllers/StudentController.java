package com.projects.management.controllers;

import com.projects.management.model.Student;
import com.projects.management.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin( origins = "http://localhost:3010/")
@RestController
@RequestMapping("/api/v1/")
public class StudentController {
    @Autowired
    StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("student")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping("student")
    public List<Student> getStudents(){
        return studentService.getAllStudents();
    }
}
