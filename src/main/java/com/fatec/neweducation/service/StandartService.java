package com.fatec.neweducation.service;

import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.Standart;
import java.util.List;


public interface StandartService {

    public void save(Standart school);

    public void delete(Standart school);

    public void update(Standart school);

    public Standart findById(Integer id);

    public List<Standart> findAll();

    public void deleteById(Integer id);

    public List<Standart> findByPlayer(Player player);
}
