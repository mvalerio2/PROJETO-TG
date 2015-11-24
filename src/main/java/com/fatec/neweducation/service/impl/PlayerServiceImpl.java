package com.fatec.neweducation.service.impl;

import com.fatec.neweducation.dao.PlayerDAO;
import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.User;
import com.fatec.neweducation.service.PlayerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerDAO dao;

    @Override
    public Integer save(Player player) {
        Integer id = dao.save(player);
        return id;
    }

    @Override
    public void delete(Integer id) {
        Player player = this.findById(id);
        dao.delete(player);

    }

    @Override
    public void update(Player player) {
        dao.update(player);
    }

    @Override
    public List<Player> findAll() {
        return dao.findAll();
    }

    @Override
    public Player findById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public List<Player> findByUser(User user) {
        String query = "from " + Player.class.getName() + " p where p.fkUser.id = " + user.getId();
        return this.dao.executeQuery(query);
    }
}
