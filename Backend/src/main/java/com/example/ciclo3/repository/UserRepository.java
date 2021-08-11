package com.example.ciclo3.repository;

import com.example.ciclo3.model.UserModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserModel,Long> {
    
}
