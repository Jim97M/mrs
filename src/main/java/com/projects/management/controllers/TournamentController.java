package com.projects.management.controllers;
import com.projects.management.model.Tournament;
import com.projects.management.services.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin( origins = "http://localhost:3010/")
@RestController
@RequestMapping("/api/v1/")
public class TournamentController {

    @Autowired
    TournamentService tournamentService;

    public TournamentController(TournamentService tournamentService){this.tournamentService = tournamentService;};

    @PostMapping("club")
    public Tournament createTournament(@RequestBody Tournament tournament){return tournamentService.createTournament(tournament);};

    @GetMapping("club")
    public List<Tournament> getTournaments(){
      return tournamentService.getAllTournament();
    }
}
