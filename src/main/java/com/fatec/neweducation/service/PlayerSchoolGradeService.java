package com.fatec.neweducation.service;


import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.PlayerSchoolGrade;
import java.util.List;


public interface PlayerSchoolGradeService {

    public Integer save(PlayerSchoolGrade playerSchoolGrade);

    public void update(PlayerSchoolGrade playerSchoolGrade);

    public void delete(Integer id);

    public List<PlayerSchoolGrade> findAll();

    public List<PlayerSchoolGrade> findByPlayer(Player player);

    public PlayerSchoolGrade findById(Integer id);
}
