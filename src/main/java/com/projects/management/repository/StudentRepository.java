package com.projects.management.repository;
import com.projects.management.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends  JpaRepository<StudentEntity, Long> {
}
