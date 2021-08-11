package com.example.ciclo3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserModel{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="us_id", unique = true,nullable = false)
    private long id;

    @Column(name = "us_name")
    private String name;
    @Column(name="us_mail")
    private String correo;
    @Column(name="us_username")
    private String username;
    @Column(name="us_pass")
    private String pass;

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
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }

    
    
}
