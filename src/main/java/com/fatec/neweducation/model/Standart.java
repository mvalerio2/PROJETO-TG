/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fatec.neweducation.model;

import com.fatec.neweducation.model.resources.Hability;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author glaucia
 */
@Entity
@Table(name = "standart")
public class Standart implements Serializable {

    private static final long serialVersionUID = 7L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "hability")
    @Enumerated(EnumType.STRING)
    private Hability hability;

    @Column(name = "difficulty")
    private Integer difficulty;

    @Column(name = "creation_date")
    @Temporal(value = TemporalType.DATE)
    private Date creationDate;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_player")
    private Player fkPlayer;

    @Column(name = "active")
    private Boolean active;

    public Standart() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Player getFkPlayer() {
        return fkPlayer;
    }

    public void setFkPlayer(Player fkPlayer) {
        this.fkPlayer = fkPlayer;
    }

    public Boolean isActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }


}
