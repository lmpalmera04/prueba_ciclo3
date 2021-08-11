package com.example.ciclo3.repository;

import org.springframework.stereotype.Repository;

import com.example.ciclo3.model.GameModel;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface GameRepository extends CrudRepository<GameModel,Long>{
    
}
