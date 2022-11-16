package com.projects.management.services;
import com.projects.management.entity.ManagerEntity;
import com.projects.management.model.Club;
import com.projects.management.entity.ClubEntity;
import com.projects.management.model.Manager;
import com.projects.management.repository.ClubRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClubServiceImpl implements ClubService {
    ClubRepository clubRepository;

    public ClubServiceImpl(ClubRepository clubRepository) {this.clubRepository = clubRepository;}

    @Override
    public Club createClub(Club club) {
        ClubEntity clubEntity = new ClubEntity();
        BeanUtils.copyProperties(club, clubEntity);
        clubRepository.save(clubEntity);
        return club;
    }

    @Override
    public List<Club> getAllClub() {
        List<ClubEntity> clubEntities = clubRepository.findAll();

        List<Club> clubs = clubEntities.stream().map(clb -> new Club(
                clb.getId(),
                clb.getName(),
                clb.getCategory(),
                clb.getType()
        )).collect(Collectors.toList());
        return clubs;
    }


    @Override
    public boolean deleteClub(Long id) {
        return false;
    }

    @Override
    public Club getClubById(Long id) {
        return null;
    }

    @Override
    public Club updateManager(Long id, Club club) {
        return null;
    }

}
