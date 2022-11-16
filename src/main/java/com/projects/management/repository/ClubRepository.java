package com.projects.management.repository;
import com.projects.management.entity.ClubEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends  JpaRepository<ClubEntity, Long> {

}
