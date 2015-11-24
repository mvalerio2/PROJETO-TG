/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fatec.neweducation.model.dto;

import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.PlayerSchoolGrade;
import com.fatec.neweducation.model.School;


public class FakePlayerSchoolGrade {

    private Player player;

    private School school;

    private PlayerSchoolGrade playerSchoolGrade;

    //id's
    private Integer idSchool;
    private Integer idPlayerSchoolGrade;

    private Integer yearClasse;
    private Integer minYear;
    private Integer classe;

    public FakePlayerSchoolGrade() {
        this.playerSchoolGrade = new PlayerSchoolGrade();
        this.school = new School();
        this.player = new Player();

    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Integer getIdSchool() {
        return idSchool;
    }

    public void setIdSchool(Integer idSchool) {
        this.idSchool = idSchool;
    }

    public Integer getIdPlayerSchoolGrade() {
        return idPlayerSchoolGrade;
    }

    public void setIdPlayerSchoolGrade(Integer idPlayerSchoolGrade) {
        this.idPlayerSchoolGrade = idPlayerSchoolGrade;
    }

    public Integer getYearClasse() {
        return yearClasse;
    }

    public void setYearClasse(Integer yearClasse) {
        this.yearClasse = yearClasse;
    }

    public Integer getMinYear() {
        return minYear;
    }

    public void setMinYear(Integer minYear) {
        this.minYear = minYear;
    }

    public Integer getClasse() {
        return classe;
    }

    public void setClasse(Integer classe) {
        this.classe = classe;
    }

    public PlayerSchoolGrade getPlayerSchoolGrade() {

        if (this.classe != null) {
            this.playerSchoolGrade.setClasse(this.getClasse());
        }

        if (this.idPlayerSchoolGrade != null) {
            this.playerSchoolGrade.setId(this.getIdPlayerSchoolGrade());
        }

        if (this.player != null) {
            this.playerSchoolGrade.setFkPlayer(this.getPlayer());
        }

        if (this.school != null) {
            this.playerSchoolGrade.setFkSchool(this.getSchool());
        }

        if (this.yearClasse != null) {
            this.playerSchoolGrade.setYearClasse(this.getYearClasse());
        }
        this.playerSchoolGrade.setActive(Boolean.TRUE);

        return playerSchoolGrade;
    }

    public void setPlayerSchoolGrade(PlayerSchoolGrade playerSchoolGrade) {

        if (playerSchoolGrade.getFkPlayer() != null) {
            this.setPlayer(playerSchoolGrade.getFkPlayer());
        }

        if (playerSchoolGrade.getFkSchool() != null) {
            this.setSchool(playerSchoolGrade.getFkSchool());
        }

        if (playerSchoolGrade.getClasse() != null) {
            this.setClasse(playerSchoolGrade.getClasse());
        }

        if (playerSchoolGrade.getYearClasse() != null) {
            this.setYearClasse(playerSchoolGrade.getYearClasse());
        }

        if (playerSchoolGrade.getId() != null) {
            this.setIdPlayerSchoolGrade(playerSchoolGrade.getId());
        }

        this.playerSchoolGrade = playerSchoolGrade;
    }


}
