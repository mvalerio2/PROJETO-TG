package com.fatec.neweducation.dao;


import com.fatec.neweducation.model.Question;
import com.fatec.neweducation.model.School;
import java.util.List;


public interface SchoolDAO {

    public School getById(Integer id);

    public Integer save(School entity);

    public void update(School entity);

    public void delete(School entity);

    public List<School> findAll();

    public List<School> executeQuery(String query);
}
