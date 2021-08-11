package com.example.ciclo3.services;

import java.util.ArrayList;

import com.example.ciclo3.model.TeamModel;
import com.example.ciclo3.repository.TeamRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class TeamService {
    
    @Autowired
    TeamRepository teamRepository;

    public ArrayList<TeamModel> readTeams(){
        return (ArrayList<TeamModel>) teamRepository.findAll();
    }

    public TeamModel saveTeam(TeamModel team){
        return teamRepository.save(team);
    }

    public Optional<TeamModel> findTeam(Long id){
        return teamRepository.findById(id);
    }
}
