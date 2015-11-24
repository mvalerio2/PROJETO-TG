package com.fatec.neweducation.dao;


import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.Question;
import java.util.List;


public interface PlayerDAO {

    public Player getById(Integer id);

    public Integer save(Player entity);

    public void update(Player entity);

    public void delete(Player entity);

    public List<Player> findAll();

    public List<Player> executeQuery(String query);
}
