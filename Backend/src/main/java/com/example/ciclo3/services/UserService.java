package com.example.ciclo3.services;

import java.util.ArrayList;

import com.example.ciclo3.model.UserModel;
import com.example.ciclo3.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> readUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel user)
    {
        return userRepository.save(user);
    }
    
}
