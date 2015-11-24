package com.fatec.neweducation.service.impl;

import com.fatec.neweducation.dao.SchoolDAO;
import com.fatec.neweducation.model.School;
import com.fatec.neweducation.service.SchoolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    protected SchoolDAO dao;

    public SchoolServiceImpl() {
    }

    @Override
    public void save(School school) {
        dao.save(school);
    }

    @Override
    public void delete(School school) {
        school.setActive(Boolean.FALSE);
        dao.update(school);
    }

    @Override
    public void update(School school) {
        dao.update(school);
    }

    @Override
    public School findById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public List<School> findAll() {
        String query = "from " + School.class.getName() + " s where s.active = 1";
        return this.dao.executeQuery(query);
    }

    @Override
    public void deleteById(Integer id) {
        School school = dao.getById(id);
        school.setActive(Boolean.FALSE);
        dao.update(school);
    }
}
