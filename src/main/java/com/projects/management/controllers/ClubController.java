package com.projects.management.controllers;
import com.projects.management.model.Club;
import com.projects.management.services.ClubService;
import com.projects.management.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@CrossOrigin( origins = "http://localhost:3010/")
@RestController
@RequestMapping("/api/v1/")
public class ClubController {

    @Autowired
    ClubService clubService;

    public ClubController(ClubService clubService) {this.clubService = clubService;}

    @PostMapping("club")
    public Club createClub(@RequestBody Club club){
      return clubService.createClub(club);
    }

    @GetMapping("club")
    public List<Club> getClub(){
        return clubService.getAllClub();
    }



}
