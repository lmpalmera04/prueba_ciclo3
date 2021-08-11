package com.example.ciclo3.repository;

import com.example.ciclo3.model.TeamModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends CrudRepository<TeamModel,Long>{
    
}
