package com.fatec.neweducation.service.impl;

import com.fatec.neweducation.dao.StandartDAO;
import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.Standart;
import com.fatec.neweducation.service.StandartService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class StandartServiceImpl implements StandartService {

    @Autowired
    protected StandartDAO dao;

    public StandartServiceImpl() {
    }

    @Override
    public void save(Standart standart) {
        dao.save(standart);
    }

    @Override
    public void delete(Standart standart) {
        standart.setActive(Boolean.FALSE);
        dao.update(standart);
    }

    @Override
    public void update(Standart standart) {
        dao.update(standart);
    }

    @Override
    public Standart findById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public List<Standart> findAll() {
        String query = "from " + Standart.class.getName() + " s where s.active = 1";
        return this.dao.executeQuery(query);
    }

    @Override
    public void deleteById(Integer id) {
        Standart standart = dao.getById(id);
        dao.delete(standart);
    }

    @Override
    public List<Standart> findByPlayer(Player player) {
        String query = "from " + Standart.class.getName() + " s where s.fkPlayer.id = " + player.getId() + "and s.active = 1";
        return this.dao.executeQuery(query);
    }
}
