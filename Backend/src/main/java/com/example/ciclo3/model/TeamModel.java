package com.example.ciclo3.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name="teams")
public class TeamModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="tm_id", unique = true,nullable = false)
    long id;
    
    @Column(name = "tm_name")
    String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
    
}
