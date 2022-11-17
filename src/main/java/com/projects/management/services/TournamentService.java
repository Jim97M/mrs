package com.projects.management.services;
import com.projects.management.model.Tournament;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TournamentService {
    Tournament createTournament(Tournament tournament);

    List<Tournament> getAllTournament();

}
