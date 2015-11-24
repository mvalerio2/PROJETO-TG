package com.fatec.neweducation.dao.impl;

import com.fatec.neweducation.dao.PlayerSchoolGradeDAO;
import com.fatec.neweducation.model.PlayerSchoolGrade;
import com.fatec.neweducation.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;


@Repository
public class PlayerSchoolGradeDAOImpl implements PlayerSchoolGradeDAO {

    private Session session;

    @Override
    public PlayerSchoolGrade getById(Integer id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        PlayerSchoolGrade entity = (PlayerSchoolGrade) session.get(PlayerSchoolGrade.class, id);
        tx.commit();
        return entity;
    }

    @Override
    public Integer save(PlayerSchoolGrade entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Integer id = (Integer) session.save(entity);
        tx.commit();
        return id;
    }

    @Override
    public void update(PlayerSchoolGrade entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(entity);
        tx.commit();
    }

    @Override
    public void delete(PlayerSchoolGrade entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(entity);
        tx.commit();
    }

    @Override
    public List<PlayerSchoolGrade> findAll() {
        String query = "from " + PlayerSchoolGrade.class.getName();
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<PlayerSchoolGrade> list = session.createQuery(query).list();
        tx.commit();
        return list;
    }

    public List<PlayerSchoolGrade> findByPlayer(Integer id) {
        String query = "from " + PlayerSchoolGrade.class.getName() + " psg where psg.fkPlayer = " + id;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<PlayerSchoolGrade> list = session.createQuery(query).list();
        tx.commit();
        return list;
    }

    @Override
    public List<PlayerSchoolGrade> executeQuery(String query) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<PlayerSchoolGrade> list = session.createQuery(query).list();
        tx.commit();
        return list;
    }
}
