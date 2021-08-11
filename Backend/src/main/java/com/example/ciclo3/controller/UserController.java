package com.example.ciclo3.controller;

import java.util.ArrayList;

import com.example.ciclo3.model.UserModel;
import com.example.ciclo3.services.UserService;

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
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public ArrayList<UserModel> obtenerUsuarios(){
        return userService.readUsers();
    }

    @PostMapping
    public UserModel saveUser(@RequestBody UserModel user){
        return userService.saveUser(user);
    }
    
}
