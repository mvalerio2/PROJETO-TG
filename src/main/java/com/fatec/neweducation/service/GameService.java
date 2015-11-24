package com.fatec.neweducation.service;


import com.fatec.neweducation.model.Game;
import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.PlayerSchoolGrade;
import com.fatec.neweducation.model.User;
import com.fatec.neweducation.model.resources.Hability;
import java.util.List;


public interface GameService {

    public void save(Game game);

    public void update(Game game);

    public void delete(Integer id);

    public Game findById(Integer id);

    public List<Game> findAll();

    public List<Game> findByUser(User user);

    public List<Game> findByUserAndHability(User user, Hability hability);

    public List<Game> findByUserAndHabilityIsCorrect(User user, Hability hability);

    public List<Game> findBySchoolGradeAndHability(PlayerSchoolGrade psg, Hability hability);

    public List<Game> findBySchoolGradeAndHabilityIsCorrect(PlayerSchoolGrade psg, Hability hability);

    public Double acertsByPlayerAndHability(Player player, Hability hability);

}
