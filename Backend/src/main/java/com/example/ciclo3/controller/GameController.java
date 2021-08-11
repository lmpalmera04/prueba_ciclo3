package com.example.ciclo3.controller;

import java.util.ArrayList;

import com.example.ciclo3.model.GameModel;
import com.example.ciclo3.services.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/game")
public class GameController {
    @Autowired
    GameService partidoServicio;

    @GetMapping
    public ArrayList<GameModel> readGames(){
        return partidoServicio.readGames();
    }
    
    @PostMapping
    public GameModel saveGame(@RequestBody GameModel partido){
        return partidoServicio.saveGame(partido);
    }
    
}
