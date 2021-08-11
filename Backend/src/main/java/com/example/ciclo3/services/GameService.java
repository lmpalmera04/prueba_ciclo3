package com.example.ciclo3.services;

import java.util.ArrayList;

import com.example.ciclo3.model.GameModel;
import com.example.ciclo3.repository.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    public ArrayList<GameModel> readGames(){
        return (ArrayList<GameModel>) gameRepository.findAll();
    }
    public GameModel saveGame(GameModel game){
        return gameRepository.save(game);
    }
    
}
