package com.projects.management.services;
import com.projects.management.entity.ManagerEntity;
import com.projects.management.model.Manager;
import com.projects.management.model.Student;
import com.projects.management.entity.StudentEntity;

import com.projects.management.repository.StudentRepository;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository){this.studentRepository = studentRepository;}


    @Override
    public Student createStudent(Student student) {
        StudentEntity studentEntity = new StudentEntity();

        BeanUtils.copyProperties(student, studentEntity);
        studentRepository.save(studentEntity);
        return student;
    }


    @Override
    public List<Student> getAllStudents() {
        List<StudentEntity> studentEntities = studentRepository.findAll();

        List<Student> students = studentEntities.stream().map(stn -> new Student(
                stn.getId(),
                stn.getAdmNo(),
                stn.getStudentName()
        )).collect(Collectors.toList());
        return students;
    }

}
