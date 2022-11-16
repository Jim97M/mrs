package com.projects.management.services;
import com.projects.management.model.Club;
import com.projects.management.model.Manager;
import org.springframework.stereotype.Service;
import java.util.List;

public interface ClubService {
    Club createClub(Club club);

    List<Club> getAllClub();


    boolean deleteClub(Long id);

    Club getClubById(Long id);

    Club updateManager(Long id, Club club);
}
