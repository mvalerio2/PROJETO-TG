package com.fatec.neweducation.service.impl;

import com.fatec.neweducation.dao.GameDAO;
import com.fatec.neweducation.model.Game;
import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.PlayerSchoolGrade;
import com.fatec.neweducation.model.User;
import com.fatec.neweducation.model.resources.Hability;
import com.fatec.neweducation.service.GameService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class GameServiceImpl implements GameService {

    @Autowired
    private GameDAO dao;

    @Override
    public void save(Game game) {
        game.setCreationDate(new Date());
        dao.save(game);

    }

    @Override
    public void update(Game game) {
        dao.update(game);

    }

    @Override
    public void delete(Integer id) {
        Game game = this.findById(id);
        dao.delete(game);

    }

    @Override
    public List<Game> findAll() {
        return dao.findAll();
    }

    @Override
    public List<Game> findByUser(User user) {
        String query = "from " + Game.class.getName() + " g where g.fkPlayerSchoolGrade.fkPlayer.fkUser.id = " + user.getId();
        return this.dao.executeQuery(query);
    }

    @Override
    public Game findById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public List<Game> findByUserAndHability(User user, Hability hability) {
        String query = "from " + Game.class.getName() + " g where g.fkPlayerSchoolGrade.fkPlayer.fkUser.id = " + user.getId() + " and g.fkQuestionGame.hability = '" + hability + "'";
        return this.dao.executeQuery(query);
    }

    @Override
    public List<Game> findByUserAndHabilityIsCorrect(User user, Hability hability) {
        String query = "from " + Game.class.getName() + " g where g.fkPlayerSchoolGrade.fkPlayer.fkUser.id = " + user.getId() + " and g.fkQuestionGame.hability = '" + hability + "' and g.isCorrectAnswer = 1";
        return this.dao.executeQuery(query);
    }

    @Override
    public List<Game> findBySchoolGradeAndHability(PlayerSchoolGrade psg, Hability hability) {
        String query = "from " + Game.class.getName() + " g where g.fkPlayerSchoolGrade.id = " + psg.getId() + " and g.fkQuestionGame.hability = '" + hability + "'";
        return this.dao.executeQuery(query);
    }

    @Override
    public List<Game> findBySchoolGradeAndHabilityIsCorrect(PlayerSchoolGrade psg, Hability hability) {
        String query = "from " + Game.class.getName() + " g where g.fkPlayerSchoolGrade.id = " + psg.getId() + " and g.fkQuestionGame.hability = '" + hability + "' and g.isCorrectAnswer = 1";
        return this.dao.executeQuery(query);
    }

    @Override
    public Double acertsByPlayerAndHability(Player player, Hability hability) {
        List<Game> listTotal = this.findByUserAndHability(player.getFkUser(), hability);
        List<Game> listCorrect = this.findByUserAndHabilityIsCorrect(player.getFkUser(), hability);
        Integer correct = listCorrect.size();
        Integer total = listTotal.size();
        if (0.0 < total) {
            return (correct.doubleValue() / total.doubleValue()) * 100;
        }
        return 0.0;
    }
}
