package com.example.ciclo3.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="games")
public class GameModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="gm_id", unique = true,nullable = false)
    long id;

    @Column(name="gm_date")
    Date date;

    @Column(name="gm_user")
    int usuario;

    @Column(name="gm_local")
    int local;

    @Column(name="gm_away")
    int away;

    @Column(name="gm_gl")
    int goals_l;

    @Column(name="gm_gv")
    int goals_v;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getLocal() {
        return local;
    }

    public void setLocal(int local) {
        this.local = local;
    }

    public int getAway() {
        return away;
    }

    public void setAway(int away) {
        this.away = away;
    }

    public int getGoals_l() {
        return goals_l;
    }

    public void setGoals_l(int goals_l) {
        this.goals_l = goals_l;
    }

    public int getGoals_v() {
        return goals_v;
    }

    public void setGoals_v(int goals_v) {
        this.goals_v = goals_v;
    }
    
     
}
