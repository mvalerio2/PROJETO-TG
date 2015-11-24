package com.fatec.neweducation.dao;


import com.fatec.neweducation.model.Game;
import com.fatec.neweducation.model.Player;
import java.util.List;


public interface GameDAO {

    public Game getById(Integer id);

    public Integer save(Game entity);

    public void update(Game entity);

    public void delete(Game entity);

    public List<Game> findAll();

    public List<Game> executeQuery(String query);
}
