/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fatec.neweducation.model.dto;

import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.Standart;
import com.fatec.neweducation.model.resources.Hability;
import java.util.Date;


public class FakeStandart {

    private Player player;

    private Standart standart;

    private Integer idPlayer;
    private Integer idStandart;
    private Hability hability;
    private Integer difficulty;
    private Date creationDate;

    public FakeStandart() {
        this.player = new Player();
        this.standart = new Standart();

    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Integer getIdStandart() {
        return idStandart;
    }

    public void setIdStandart(Integer idStandart) {
        this.idStandart = idStandart;
    }

    public Hability getHability() {
        return hability;
    }

    public void setHability(Hability hability) {
        this.hability = hability;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Standart getStandart() {
        if (this.player != null) {
            this.standart.setFkPlayer(this.getPlayer());
        }

        if (this.difficulty != null) {
            this.standart.setDifficulty(difficulty);
        } else {
            this.standart.setDifficulty(1);
        }

        if (this.hability != null) {
            this.standart.setHability(this.getHability());
        }

        this.standart.setCreationDate(new Date());
        this.standart.setActive(Boolean.TRUE);

        return standart;
    }

    public void setStandart(Standart standart) {

        if (standart.getDifficulty() != null) {
            this.setDifficulty(standart.getDifficulty());
        }

        if (standart.getFkPlayer() != null) {
            this.setPlayer(standart.getFkPlayer());
        }

        if (standart.getHability() != null) {
            this.setHability(standart.getHability());
        }

        if (standart.getId() != null) {
            this.setIdStandart(standart.getId());
        }

        if (standart.getCreationDate() != null) {
            this.setCreationDate(standart.getCreationDate());
        }

        this.standart = standart;
    }

    public Integer getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(Integer idPlayer) {
        this.idPlayer = idPlayer;
    }

    
    
}
