package com.projects.management.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projects.management.entity.TournamentEntity;

@Repository
public interface TournamentRepository extends JpaRepository<TournamentEntity, Long> {
}
