package com.projects.management.services;
import com.projects.management.repository.TournamentRepository;
import com.projects.management.model.Tournament;
import com.projects.management.entity.TournamentEntity;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class TournamentServiceImpl implements TournamentService {

    TournamentRepository tournamentRepository;
            public TournamentServiceImpl(TournamentRepository tournamentRepository){this.tournamentRepository = tournamentRepository;}


    @Override
    public Tournament createTournament(Tournament tournament) {
        TournamentEntity tournamentEntity = new TournamentEntity();
        BeanUtils.copyProperties(tournament, tournamentEntity);
        tournamentRepository.save(tournamentEntity);
        return tournament;

    }

    @Override
    public List<Tournament> getAllTournament() {
        List<TournamentEntity> tournamentEntities = tournamentRepository.findAll();
        List<Tournament> tournaments = tournamentEntities.stream().map( tnt -> new Tournament(
                tnt.getId(),
                tnt.getName(),
                tnt.getDescription()
        )).collect(Collectors.toList());
        return tournaments;
    }
}
