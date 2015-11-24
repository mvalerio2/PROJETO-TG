package com.fatec.neweducation.dao.impl;

import com.fatec.neweducation.dao.GameDAO;
import com.fatec.neweducation.model.Game;
import com.fatec.neweducation.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;


@Repository
public class GameDAOImpl implements GameDAO {

    private Session session;

    @Override
    public Game getById(Integer id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Game entity = (Game) session.get(Game.class, id);
        tx.commit();
        return entity;
    }

    @Override
    public Integer save(Game entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Integer id = (Integer) session.save(entity);
        tx.commit();
        return id;
    }

    @Override
    public void update(Game entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(entity);
        tx.commit();
    }

    @Override
    public void delete(Game entity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(entity);
        tx.commit();
    }

    @Override
    public List<Game> findAll() {
        String query = "from " + Game.class.getName();
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Game> list = session.createQuery(query).list();
        tx.commit();
        return list;
    }

    @Override
    public List<Game> executeQuery(String query) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Game> list = session.createQuery(query).list();
        tx.commit();
        return list;
    }
}
