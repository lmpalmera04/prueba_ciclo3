package com.example.ciclo3.controller;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ciclo3.model.TeamModel;
import com.example.ciclo3.services.TeamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/team")
public class TeamController {
    @Autowired
    TeamService equipoServicio;

    @GetMapping
    public ArrayList<TeamModel> obtenerEquipos(){
        return equipoServicio.readTeams();
    }

    @PostMapping
    public TeamModel guardarUsuario(@RequestBody TeamModel equipo){
        return equipoServicio.saveTeam(equipo);
    }

    @GetMapping(path="/{id}")
    public Optional<TeamModel> traerNombreEqu(@PathVariable("id") Long id){
        return this.equipoServicio.findTeam(id);
    }
    
}
