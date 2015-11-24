package com.fatec.neweducation.service.impl;

import com.fatec.neweducation.dao.PlayerSchoolGradeDAO;
import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.PlayerSchoolGrade;
import com.fatec.neweducation.service.PlayerSchoolGradeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class PlayerSchoolGradeServiceImpl implements PlayerSchoolGradeService {

    @Autowired
    private PlayerSchoolGradeDAO dao;

    @Override
    public Integer save(PlayerSchoolGrade playerSchoolGrade) {
        Player player = playerSchoolGrade.getFkPlayer();
        List<PlayerSchoolGrade> list = this.findByPlayer(player);
        //Desabilita as escolas antigas
        for (PlayerSchoolGrade psg : list) {
            psg.setActive(Boolean.FALSE);
            dao.update(psg);
        }
        //Salva a nova
        Integer id = dao.save(playerSchoolGrade);
        return id;
    }

    @Override
    public void update(PlayerSchoolGrade playerSchoolGrade) {
        dao.update(playerSchoolGrade);

    }

    @Override
    public void delete(Integer id) {
        PlayerSchoolGrade playerSchoolGrade = this.findById(id);
        playerSchoolGrade.setActive(Boolean.FALSE);
        dao.update(playerSchoolGrade);

    }

    @Override
    public List<PlayerSchoolGrade> findAll() {
        String query = "from " + PlayerSchoolGrade.class.getName() + " psg where psg.active = 1";
        return this.dao.executeQuery(query);
    }

    @Override
    public List<PlayerSchoolGrade> findByPlayer(Player player) {
        String query = "from " + PlayerSchoolGrade.class.getName() + " psg where psg.fkPlayer.id = " + player.getId() + "and psg.active = 1";
        return this.dao.executeQuery(query);
    }

    @Override
    public PlayerSchoolGrade findById(Integer id) {
        return dao.getById(id);
    }
}
